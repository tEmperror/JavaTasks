package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;
        PersonScannerAdapter (Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String[] strings = fileScanner.next().split(" ");
            SimpleDateFormat newDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.getDefault());
            Date date = null;
            try {
                date = newDateFormat.parse(strings[3] + " " + strings[4] + " " + strings[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(strings[0], strings[1], strings[2], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
