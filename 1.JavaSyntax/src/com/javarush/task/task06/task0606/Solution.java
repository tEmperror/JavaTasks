package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        boolean flag = true;

        while (flag == true) {
            if (a/10 == 0) {
                if (a%2 == 0) {
                    even++;
                }else {
                    odd++;
                }

                flag = false;
            }else {
                if ((a%10)%2 == 0) {
                    even++;
                }else {
                    odd++;
                }
                a = a/10;
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
