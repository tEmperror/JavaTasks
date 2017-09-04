package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);

        if ((x > 0) && (y > 0)) {
            System.out.println(1);
        }
        if ((x < 0) && (y > 0)) {
            System.out.println(2);
        }
        if ((x < 0) && (y < 0)) {
            System.out.println(3);
        }
        if ((x > 0) && (y < 0)) {
            System.out.println(4);
        }
    }
}
