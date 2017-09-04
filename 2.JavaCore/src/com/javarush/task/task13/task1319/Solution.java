package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        String s = "";

        while (!(s.equals("exit"))) {
            s = reader.readLine();
            writer.write(s + "\n");
        }

        reader.close();
        writer.close();
    }
}
