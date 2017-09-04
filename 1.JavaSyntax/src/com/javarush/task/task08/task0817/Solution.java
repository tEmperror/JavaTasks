package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();
        map.put("Stallone1","Popa1");
        map.put("Stallone2","Popa2");
        map.put("Stallone3","Popa3");
        map.put("Stallone4","Popa4");
        map.put("Stallone5","Popa5");
        map.put("Stallone6","Popa6");
        map.put("Stallone7","Popa7");
        map.put("Stallone8","Popa8");
        map.put("Stallone9","Popa8");
        map.put("Stallone0","Popa9");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap< String, String > map) {
        //напишите тут ваш код
        HashMap< String, String>  copy = new HashMap< >(map);
        for (Map.Entry< String, String > entry : copy.entrySet()) {
            for (Map.Entry< String, String > maps : map.entrySet()) {
                if (entry.getValue().equals(maps.getValue()) && !entry.getKey().equals(maps.getKey())) {
                    removeItemFromMapByValue(map, entry.getValue());
                    break;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
