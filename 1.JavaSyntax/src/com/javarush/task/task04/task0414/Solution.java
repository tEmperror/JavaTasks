package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        int x = 0;

        if ((a % 100) == 0){
            if ((a % 400) == 0){
                x = 366;
            }else {
                x = 365;
            }
        }else if ((a % 4) != 0) {
            x = 365;
        }else {
            x = 366;
        }

        System.out.println("количество дней в году: " + x);
    }
}