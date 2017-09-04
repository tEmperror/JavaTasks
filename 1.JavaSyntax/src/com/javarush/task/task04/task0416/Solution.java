package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double i = Double.parseDouble(s);
        i = i % 5.0;

        if ((i >= 0.0) && (i < 3.0)) {
            System.out.println("зелёный");
        }else if ((i >= 3.0) && (i < 4.0)) {
            System.out.println("желтый");
        }else {
            System.out.println("красный");
        }
    }
}