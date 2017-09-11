package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty())
            throw new TooShortStringException();

        String[] strings = string.trim().split(" ");
        if (strings.length < 5)
            throw new TooShortStringException();

        return (strings[1] + " " + strings[2] + " " + strings[3] + " " + strings[4]);
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
