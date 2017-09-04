package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);

        if (a == 0) {
            System.out.println("ноль");
        }else {
            if (a > 0) {
                System.out.print("положительное ");
            }else {
                System.out.print("отрицательное ");
            }

            if (a % 2 == 0) {
                System.out.println("четное число");
            }else {
                System.out.println("нечетное число");
            }
        }

    }
}
