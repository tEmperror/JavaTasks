package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        int p = 0;
        int o = 0;

        if (a > 0) {
            p++;
        }else if (a < 0) {
            o++;
        }
        if (b > 0) {
            p++;
        }else if (b < 0) {
            o++;
        }
        if (c > 0) {
            p++;
        }else if (c < 0) {
            o++;
        }
        System.out.println("количество отрицательных чисел: " + o);
        System.out.println("количество положительных чисел: " + p);
    }
}
