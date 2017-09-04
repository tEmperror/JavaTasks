package com.javarush.task.task19.task1918;

/*
Знакомство с тегами
*/
import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String f = a.readLine();
        a.close();
        BufferedReader b = new BufferedReader(new FileReader(f));
        String c = "";
        while (b.ready()) {
            c = c + b.readLine();
        }
        b.close();

        // Заменяем <span> на <span > чтобы не искать по подстроке. Потом вернем обратно
        c = c.replace("<" + args[0] + ">", "<" + args[0] + " >");
        // Сколько пар тегов в файле
        int count = 0;
        Pattern p = Pattern.compile("</" + args[0] + ">");
        Matcher m = p.matcher(c);
        while (m.find())
            count++;
        // Если открывающийся тег, заносим в мапу индекс тега со значением null.
        // Если закрывающийся тег, то ищем последний элемент мапы с null и пищем туда индекс тега
        Map<Integer, Integer> map = new TreeMap<>();
        int pos = -1;
        for (int i = 0; i < count * 2; i++) {
            int posTagBegin = c.indexOf("<" + args[0] + " ", pos + 1);
            int posTagEnd = c.indexOf("</" + args[0] + ">", pos + 1);
            if (posTagBegin >= 0 && posTagBegin < posTagEnd) {
                pos = posTagBegin;
                map.put(posTagBegin, null);
            } else {
                ArrayList<Integer> keys = new ArrayList<>(map.keySet());
                for (int j = keys.size() - 1; j >= 0; j--) {
                    if (map.get(keys.get(j)) == null) {
                        map.put(keys.get(j), posTagEnd);
                        break;
                    }
                }
                pos = posTagEnd;
            }
        }
        // Вывод
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(c.substring(entry.getKey(), entry.getValue() + args[0].length() +3).replace("<" + args[0] + " >", "<" + args[0] + ">"));
        }
    }
}
