package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);


        if ((a >= 1) && (a <= 999)) {
            if (a % 2 == 0) {
                System.out.print("четное ");
            } else {
                System.out.print("нечетное ");
            }

            if (a / 100 != 0) {
                System.out.println("трехзначное число");
            } else if (a / 10 != 0) {
                System.out.println("двузначное число");
            } else {
                System.out.println("однозначное число");
            }
        }
    }
}
