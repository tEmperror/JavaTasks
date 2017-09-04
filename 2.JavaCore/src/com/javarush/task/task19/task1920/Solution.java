package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String,Double> map = new TreeMap<>();
        double max = 0;

        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            boolean flag = false;
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (entry.getKey().equals(line[0])) {
                    double count = entry.getValue() + Double.parseDouble(line[1]);
                    entry.setValue(count);

                    if (count > max) max = count;
                    flag = true;
                }
            }

            if (flag == false) {
                map.put(line[0], Double.parseDouble(line[1]));
                if (Double.parseDouble(line[1]) > max) max = Double.parseDouble(line[1]);
            }
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() == max)
                System.out.println(entry.getKey());
        }

        reader.close();
    }
}
