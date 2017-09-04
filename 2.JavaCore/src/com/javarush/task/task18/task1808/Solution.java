package com.javarush.task.task18.task1808;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2= reader.readLine();
        String s3 = reader.readLine();
        FileInputStream stream1 = new FileInputStream(s1);
        FileOutputStream stream2 = new FileOutputStream(s2);
        FileOutputStream stream3 = new FileOutputStream(s3);

        if (stream1.available() > 0) {
            byte[] bytes = new byte[10000];
            int count = stream1.read(bytes);

            if (count % 2 == 0) {
                stream2.write(bytes, 0, count / 2);
                stream3.write(bytes, count / 2, count / 2);
            }else {
                stream2.write(bytes, 0, count / 2 + 1);
                stream3.write(bytes, count / 2 + 1, count / 2);
            }
        }

        reader.close();
        stream1.close();
        stream2.close();
        stream3.close();
    }
}
