package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        ArrayList<Integer> file1 = new ArrayList<>();

        FileInputStream stream1 = new FileInputStream(s1);
        while (stream1.available() > 0) {
            file1.add(stream1.read());
        }
        stream1.close();

        FileOutputStream stream = new FileOutputStream(s1);
        FileInputStream stream2 = new FileInputStream(s2);
        while (stream2.available() > 0) {
            stream.write(stream2.read());
        }
        stream2.close();

        for (Integer integer : file1) {
            stream.write(integer);
        }

        stream.close();
        reader.close();
    }
}
