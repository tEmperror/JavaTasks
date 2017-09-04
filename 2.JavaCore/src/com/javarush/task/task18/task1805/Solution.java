package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file);

        ArrayList<Integer> list = new ArrayList<>();

        while(inputStream.available() > 0){
            int value = inputStream.read();
            if (!list.contains(value)) list.add(value);
        }

        Collections.sort(list);

        for(Integer x : list){
            System.out.print(x + " ");
        }

        reader.close();
        inputStream.close();
    }
}
