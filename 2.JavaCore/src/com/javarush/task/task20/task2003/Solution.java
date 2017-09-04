package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream stream = new FileInputStream(fileName);
        try {
            load(stream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties properties1 = new Properties();
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            properties1.setProperty(entry.getKey(), entry.getValue());
        }
        properties1.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        Properties properties = new Properties();
        properties.load(inputStream);
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            Solution.properties.put(entry.getKey().toString(), entry.getValue().toString());
        }
    }

    public static void main(String[] args) {

    }
}
