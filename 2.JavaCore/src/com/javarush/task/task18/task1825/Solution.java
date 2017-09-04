package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fileNames = new ArrayList<>();
        ArrayList<String> fileNamesSort = new ArrayList<>();
        String s = reader.readLine();

        while (!s.equals("end")) {
            fileNames.add(s);
            s = reader.readLine();
        }
        reader.close();

        int point = fileNames.get(0).lastIndexOf(".");
        String origWay = fileNames.get(0).substring(0, point);
        FileOutputStream stream = new FileOutputStream(origWay);

        for (int i = 0; i < fileNames.size(); i++) {
            for (int j = 0; j < fileNames.size(); j++) {
                String[] parts = fileNames.get(j).split("\\.");
                int t = parts[parts.length - 1].lastIndexOf("t");
                String part = parts[parts.length - 1].substring(t + 1, parts[parts.length - 1].length());
                if (i + 1 == Integer.parseInt(part)) fileNamesSort.add(fileNames.get(j));
            }
        }

        for (int i = 0; i < fileNamesSort.size(); i++) {
            FileInputStream file = new FileInputStream(fileNamesSort.get(i));
            byte[] bytes = new byte[10000];
            int count = file.available();
            file.read(bytes);
            stream.write(bytes, 0, count);
            file.close();
        }

        stream.close();
    }
}
