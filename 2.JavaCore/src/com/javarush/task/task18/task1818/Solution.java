package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        FileOutputStream stream1 = new FileOutputStream(s1);
        FileInputStream stream2 = new FileInputStream(s2);
        FileInputStream stream3 = new FileInputStream(s3);

        while (stream2.available() > 0) {
            stream1.write(stream2.read());
        }

        while (stream3.available() > 0) {
            stream1.write(stream3.read());
        }

        stream1.close();
        stream2.close();
        stream3.close();
    }
}
