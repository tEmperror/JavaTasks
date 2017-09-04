package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);

        if (i == 1)
            System.out.println("понедельник");
        else if (i == 2)
            System.out.println("вторник");
        else if (i == 3)
            System.out.println("среда");
        else if (i == 4)
            System.out.println("четверг");
        else if (i == 5)
            System.out.println("пятница");
        else if (i == 6)
            System.out.println("суббота");
        else if (i == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");
    }
}