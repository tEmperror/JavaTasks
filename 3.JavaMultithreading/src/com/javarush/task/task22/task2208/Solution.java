package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() != null) {
                if (i != 0) {
                    stringBuilder.append(" and ");
                }else i++;
                stringBuilder.append(entry.getKey() + " = '" + entry.getValue() + "'");
            }
        }

        return String.valueOf(stringBuilder);
    }
}
