package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        while (!fileName.equals("exit")) {
            Thread thread = new ReadThread(fileName);
            thread.start();
            fileName = reader.readLine();
        }

        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            byte[] bytes = new byte[256];

            try {
                FileInputStream file = new FileInputStream(fileName);

                while (file.available() > 0) {
                    int data = file.read();
                    bytes[data]++;
                }

                file.close();

                int max = 0;
                for (int i = 0; i < 256; i++) {
                    if (bytes[i] > max) max = bytes[i];
                }

                for (int i = 0; i < 256; i++) {
                    if (bytes[i] == max) resultMap.put(fileName, i);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
