package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[15];
        for (int i = 0; i < 15; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        int max = a[0];
        int b = 0;
        for (int i = 0; i < 15; i++) {
            if (a[i] > max) {
                max = a[i];
                b = i;
            }
        }

        if (b % 2 == 0) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
