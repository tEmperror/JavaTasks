package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);

        while (a > 0) {
            a--;
            System.out.println(s);
        }

    }
}
