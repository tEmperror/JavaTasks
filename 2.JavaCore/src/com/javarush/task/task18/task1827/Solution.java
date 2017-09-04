package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args.length < 4 || !args[0].equals("-c")) return;

        String productName;
        if (args.length > 4) {
            StringBuffer buf = new StringBuffer();
            for (int i = 1; i < args.length - 2; i++)
                buf.append(args[i]).append(" ");
            productName = buf.substring(0, buf.length() - 1);
        } else
            productName = args[1];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> fileList = new ArrayList<>();

        String s;
        String idS;
        long maxId = 0;
        int flag = 1;
        while ((s=fileReader.readLine()) != null) {
            if (flag == 1) idS = s.substring(1, 9).trim();
            else idS = s.substring(0, 8).trim();
            long id = Integer.parseInt(idS);
            if (id > maxId) maxId = id;
            fileList.add(s);
            flag++;
        }
        fileReader.close();

        s = String.format("%-8s",maxId + 1) + String.format("%-30s",productName) + String.format("%-8s",args[2])
                + String.format("%-4s",args[3]);

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
        for (String s1 : fileList) {
            fileWriter.write(s1 + "\r\n");
        }
        fileWriter.write(s);
        fileWriter.close();
    }
}
