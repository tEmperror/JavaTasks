package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        String s = args[0];
        FileInputStream stream = new FileInputStream(s);
        int sumChar = stream.available();
        int sumPr = 0;

        while (stream.available() > 0) {
            int data = stream.read();
            if (data == 32) sumPr++;
        }
        stream.close();
        System.out.println(String.format(Locale.ENGLISH,"%.2f", (float) sumPr / sumChar * 100));
    }
}
