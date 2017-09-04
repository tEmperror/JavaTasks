package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
                String s = reader.readLine();
            try {
                FileInputStream stream = new FileInputStream(s);
                stream.close();
            } catch (FileNotFoundException e) {
                System.out.println(s);
                reader.close();
                break;
            }
        }
    }
}
