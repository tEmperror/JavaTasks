package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();

        int result = 0;
        String line = outputStream.toString();
        String[] lines = line.split(" ");
        int a = Integer.parseInt(lines[0]);
        int b = Integer.parseInt(lines[2]);
        if(line.contains("+")) {
            result = a+b;
        }
        else if(line.contains("-")) {
            result = a-b;
        }
        else if(line.contains("*")) {
            result = a*b;
        }
        System.setOut(consoleStream);
        System.out.println(outputStream.toString() + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

