package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int a[] = {0,0,0};
        a[0] = Integer.parseInt(s1);
        a[1] = Integer.parseInt(s2);
        a[2] = Integer.parseInt(s3);

        if ((a[0] != a[1]) && (a[0] != a[2]) && (a[1] != a[2])) {

        }else if ((a[0] == a[1]) && (a[0] != a[2])) {
            System.out.println(3);
        }else if ((a[0] != a[1]) && (a[0] == a[2])) {
            System.out.println(2);
        }else {
            System.out.println(1);
        }
    }
}
