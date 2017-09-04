package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int m = Integer.parseInt(s1);
        int n = Integer.parseInt(s2);

        for (int i = 1; i < (m + 1); i++) {
            for (int j = 1; j < (n + 1); j++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
