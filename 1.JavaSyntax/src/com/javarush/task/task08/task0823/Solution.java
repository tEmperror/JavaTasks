package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char pr = ' ';
        char[] chars = s.toCharArray();
        boolean flag = true;

        for (char c : chars) {
            if (flag) {
                c = Character.toUpperCase(c);
                flag = false;
            }
            if (c == pr) flag = true;

            System.out.print(c);
        }
    }
}
