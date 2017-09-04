package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        BufferedReader file = new BufferedReader(new FileReader(s));

        while (!s.equals(null)) {
            s = file.readLine();
            String[] parameters = s.split(" ");
            if (Integer.parseInt(args[0]) == Integer.parseInt(parameters[0])) {
                System.out.println(s);
                break;
            }
        }

        reader.close();
        file.close();
    }
}
