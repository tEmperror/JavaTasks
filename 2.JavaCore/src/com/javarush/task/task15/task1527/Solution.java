package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        Pattern p1 = Pattern.compile(".+\\?");
        Matcher m = p1.matcher(s);
        s = m.replaceFirst("");
        String[] str = s.split("&+");
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        String[] str0;
        for (String s1 : str) {
            str0 = s1.split("=+");
            try {
                list1.add(str0[0]);
                list2.add(str0[1]);
            } catch (Exception e) {
                list2.add("");
            }
        }

        for (String s1 : list1) {
            System.out.print(s1.trim() + " ");
        }
        System.out.println();

        int i = 1;
        if (list2.size() == 2) i = 2;
        for (String s1 : list2) {
            if ((i % 2 == 0) && !(s1.equals(""))) {
                try {
                    alert(Double.parseDouble(s1));
                } catch (NumberFormatException e) {
                    alert(s1);
                }
            }
            i++;
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
