package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        int count = 0;

        while (reader.ready()) {
            String[] strings = reader.readLine().split(" ");
            for (String string : strings) {
                if (string.length() > 6){
                    if (count == 0) {
                        writer.write(string);
                        count++;
                    }else {
                        writer.write("," + string);
                    }
                }
            }
        }

        reader.close();
        writer.close();
    }
}
