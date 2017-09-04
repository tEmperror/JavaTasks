package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        FileInputStream stream1 = new FileInputStream(s1);
        FileOutputStream stream2 = new FileOutputStream(s2);

        if (stream1.available() > 0) {
            byte[] bytes = new byte[1000];
            int count = stream1.read(bytes);

            for (int i = count - 1; i >= 0; i--) {
                stream2.write(bytes[i]);
            }
        }

        reader.close();
        stream1.close();
        stream2.close();
    }
}
