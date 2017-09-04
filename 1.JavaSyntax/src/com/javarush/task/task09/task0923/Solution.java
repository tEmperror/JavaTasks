package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<Character> charArrays1 = new ArrayList<>();
        ArrayList<Character> charArrays2 = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == ' ') {

            } else {
                if (isVowel(c)) {
                    charArrays1.add(c);
                } else
                    charArrays2.add(c);
            }
        }

        for (Character character : charArrays1) {
            System.out.print(character + " ");
        }
        System.out.println();
        for (Character character : charArrays2) {
            System.out.print(character + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}