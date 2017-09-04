package com.javarush.task.task08.task0815;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Солонинка","Бил");
        map.put("Петрович","Билл");
        map.put("Казаныч","Бал");
        map.put("Пушкарь","Бел");
        map.put("Малеков","Бял");
        map.put("Басокв","Бэл");
        map.put("Кироков","Блэт");
        map.put("Гобсон","Блит");
        map.put("Гибзон","Блет");
        map.put("Сталиони","Куп");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        Collection<String> s = map.values();
        int count = 0;
        for (String s1 : s) {
            if (s1.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        Collection<String> s = map.keySet();
        int count = 0;
        for (String s1 : s) {
            if (s1.equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
