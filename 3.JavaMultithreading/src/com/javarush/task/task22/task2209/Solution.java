package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader rcon = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileIn = new BufferedReader(new FileReader(rcon.readLine())))
        {
            StringBuilder sb = new StringBuilder();
            while (fileIn.ready()) {
                sb.append(fileIn.readLine());
            }
            String[] words = sb.toString().split(" ");
            StringBuilder result = getLine(words);
            System.out.println(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder getLine(String... words) {
        if (words.length == 0 || words == null) return new StringBuilder();
        List<String> list = new LinkedList<>();

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^a-zA-Zа-яА-Я\\-]","");
        }

        for (String word : words) {
            list.add(word);
        }

        StringBuilder builder = new StringBuilder(list.get(0) + " ");
        char c = list.get(0).toCharArray()[list.get(0).toCharArray().length - 1];
        list.remove(0);

        for (int i = 0; i < list.size();) {
            char[] chars = list.get(i).toCharArray();
            if (Character.toUpperCase(c) == Character.toUpperCase(chars[0])) {
                builder.append(list.get(i) + " ");
                c = list.get(i).toCharArray()[list.get(i).toCharArray().length - 1];
                list.remove(i);
                i = 0;
            }else i++;
        }

        return builder;
    }
}
