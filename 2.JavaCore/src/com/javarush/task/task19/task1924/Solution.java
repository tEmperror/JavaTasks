package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileRead = new BufferedReader(new FileReader(fileName));

        while (fileRead.ready()) {
            String[] strings = fileRead.readLine().split(" ");
            for (int i = 0; i < strings.length; i++) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    try {
                        if (Integer.parseInt(strings[i]) == entry.getKey()) {
                            strings[i] = entry.getValue();
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }

            for (int i = 0; i < strings.length - 1; i++) {
                System.out.print(strings[i] + " ");
            }
            System.out.println(strings[strings.length - 1]);
        }
        fileRead.close();
    }
}
