package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        BufferedReader f1 = new BufferedReader(new FileReader(s1));
        BufferedWriter f2 = new BufferedWriter(new FileWriter(s2));

        String[] strings = f1.readLine().split(" ");

        for (String string : strings) {
            f2.write(Math.round(Double.parseDouble(string)) + " ");
        }

        reader.close();
        f1.close();
        f2.close();
    }
}
