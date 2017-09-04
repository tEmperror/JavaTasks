package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new LinkedList<>();
        String s1 = reader.readLine();

        while (!(s1.equals("exit"))){
            list.add(s1);
            try {
                if (s1.lastIndexOf(".") != -1) print(Double.parseDouble(s1));
                else throw new Exception();
            }catch (Exception e1) {
                try {
                    if ((Integer.parseInt(s1) > 0) && (Integer.parseInt(s1) < 128)) print(Short.parseShort(s1));
                    else if ((Integer.parseInt(s1) <= 0) || (Integer.parseInt(s1) >= 128)) print(Integer.parseInt(s1));
                }catch (Exception e) {
                    print(s1);
                }
            }

            s1 = reader.readLine();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
