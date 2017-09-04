package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            {
                PrintStream consoleStream = System.out;
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                PrintStream stream = new PrintStream(outputStream);
                System.setOut(stream);

                System.out.println(s);
                System.setOut(consoleStream);

                String result = outputStream.toString();
                StringBuilder stringBuilder = new StringBuilder(result);
                stringBuilder.reverse();
                String reverseString = stringBuilder.toString();

                //выводим ее в консоль
                System.out.println(reverseString);
            }
        }
        fileReader.close();
    }
}
