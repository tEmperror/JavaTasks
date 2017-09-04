package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        int[] a1 = new int[10];
        int[] a2 = new int[10];

        for (int i = 0; i < 20; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            a1[i] = a[i];
        }
        for (int i = 0; i < 10; i++) {
            a2[i] = a[i+10];
            System.out.println(a2[i]);
        }

    }
}
