package com.javarush.task.task19.task1919;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String,Double> map = new TreeMap<>();

        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            boolean flag = false;
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (entry.getKey().equals(line[0])) {
                    double count = entry.getValue() + Double.parseDouble(line[1]);
                    entry.setValue(count);
                    flag = true;
                }
            }

            if (flag == false) {
                map.put(line[0], Double.parseDouble(line[1]));
            }
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        reader.close();
    }
}
