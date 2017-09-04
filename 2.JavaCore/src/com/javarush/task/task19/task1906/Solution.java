package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader readfile1 = new BufferedReader(new FileReader(file1));
        BufferedWriter writefile2 = new BufferedWriter(new FileWriter(file2));

        int count = 1;
        while (readfile1.ready()) {
            int data = readfile1.read();
            if (count % 2 == 0)
                writefile2.write(data);

            count++;
        }

        readfile1.close();
        writefile2.close();
    }
}
