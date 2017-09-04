package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream(args[0]);
        Map<Integer,Integer> map = new TreeMap<>();

        while (stream.available() > 0) {
            Integer data = stream.read();
            if (map.containsKey(data)) {
                map.replace(data, map.get(data) + 1);
            }else map.put(data, 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println((char)entry.getKey().byteValue() + " " + entry.getValue());
        }

        stream.close();
    }
}
