package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sCh1 = reader.readLine();
        String sCh2 = reader.readLine();
        int Ch1 = Integer.parseInt(sCh1);
        int Ch2 = Integer.parseInt(sCh2);

        System.out.println(name + " получает " + Ch1 + " через " + Ch2 + " лет.");
    }
}
