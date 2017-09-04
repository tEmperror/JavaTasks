package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        for (int i = 1; i < 11; i++) {
            try {
                int[] a = {0};
                int b = a[-1];
            } catch (Exception e) {
                exceptions.add(e);
            }
        }
    }
}
