package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = false;
        int sum = 0;

        while (flag == false) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            sum += a;

            if (a == -1)
                flag = true;
        }
        System.out.println(sum);
    }
}
