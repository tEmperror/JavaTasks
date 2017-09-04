package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader file = new BufferedReader(new FileReader(fileName));
        int count = 0;
        while (file.ready()) {
            String s = file.readLine().replaceAll("[\\.,;:!?]", " ");
            String[] strings = s.split(" ");
            for (String string : strings) {
                if (string.equals("world")) count++;
            }
        }

        System.out.println(count);
        file.close();
    }
}
