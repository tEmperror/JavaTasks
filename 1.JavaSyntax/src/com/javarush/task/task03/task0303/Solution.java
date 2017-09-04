package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 1.2));
        System.out.println(convertEurToUsd(20, 1.4));
    }

    public static double convertEurToUsd(int eur, double course) {
        double s = eur * course;
        return s;
    }
}
