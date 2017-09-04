package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;
        int sum = 0;

        while (flag == false) {
            String s = reader.readLine();

            if (s.equals("сумма")) {
                flag = true;
            }else {
                int a = Integer.parseInt(s);
                sum += a;
            }
        }

        System.out.println(sum);
    }
}
