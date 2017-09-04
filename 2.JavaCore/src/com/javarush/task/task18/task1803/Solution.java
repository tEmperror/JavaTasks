package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream( new BufferedReader(new InputStreamReader(System.in)).readLine());
        int[] arrbytes = new int[256];

        while (inputStream.available() > 0)
            arrbytes[inputStream.read()]++;

        int max = 0;
        for (int i = 0; i < 256 ; i++)
            if (arrbytes[i] > max) max = arrbytes[i];

        for (int i = 0; i < 256; i++) {
            if (arrbytes[i] == max) System.out.print(i + " ");
        }

        inputStream.close();
    }
}
