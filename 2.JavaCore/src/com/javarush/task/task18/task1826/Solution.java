package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = new FileInputStream(args[1]);
        FileOutputStream fileOut = new FileOutputStream(args[2]);
        switch (args[0]) {
            case "-e": {
                while (fileIn.available() > 0) {
                    fileOut.write(Shifr(fileIn.read()));
                }
                break;
            }
            case "-d": {
                while (fileIn.available() > 0) {
                    fileOut.write(DeShifr(fileIn.read()));
                }
                break;
            }
        }

        fileIn.close();
        fileOut.close();
    }

    public static int Shifr(int b) {
        if (b == 254) return 1;
        return b + 1;
    }
    public static int DeShifr(int b) {
        if (b == 1) return 254;
        return b - 1;
    }
}
