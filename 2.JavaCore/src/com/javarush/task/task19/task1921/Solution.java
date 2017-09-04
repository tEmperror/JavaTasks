package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while (reader.ready()) {
            String[] strings = reader.readLine().split(" ");
            String dataString = strings[strings.length - 3] + " " + strings[strings.length - 2] +
                    " " + strings[strings.length - 1];
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            Date date = dateFormat.parse(dataString);

            String name = "";
            for (int i = 0; i < strings.length - 3; i++) {
                if (i != strings.length - 4)
                    name = name + strings[i] + " ";
                else name = name + strings[i];
            }

            PEOPLE.add(new Person(name, date));
        }
        reader.close();
    }
}
