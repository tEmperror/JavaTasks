package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader file1Read = new BufferedReader(new FileReader(file1));
        BufferedWriter file2Write = new BufferedWriter(new FileWriter(file2));

        while (file1Read.ready()) {
            String s = file1Read.readLine().replaceAll("\\.", "!");
            file2Write.write(s);
        }

        file1Read.close();
        file2Write.close();
    }
}
