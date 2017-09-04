package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("John1", 100);
        map.put("John2", 200);
        map.put("John3", 300);
        map.put("John4", 400);
        map.put("John5", 500);
        map.put("John6", 600);
        map.put("John7", 700);
        map.put("John8", 800);
        map.put("John9", 900);
        map.put("John0", 800);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String,Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> entry : copy.entrySet()) {
            if (entry.getValue() < 500) map.remove(entry.getKey());
        }
    }

    public static void main(String[] args) {

    }
}