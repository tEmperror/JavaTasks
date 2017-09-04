package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = false;
        double i = 0;
        double sum = 0;

        while (flag == false) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);

            if (a == -1) {
                flag = true;
            }else {
                sum += a;
                i++;
            }
        }

        double sr = sum / i;
        System.out.println(sr);
    }
}

