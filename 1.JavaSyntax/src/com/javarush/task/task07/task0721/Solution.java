package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] a = new int[20];

        for (int i = 0; i < 20; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        maximum = a[0];
        for (int i = 0; i < 20; i++) {
            if (a[i] > maximum)
                maximum = a[i];
        }
        minimum = maximum;
        for (int i = 0; i < 20; i++) {
            if (a[i] < minimum)
                minimum = a[i];
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
