package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] strings) throws IOException, ParseException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        //String[] strings = s.split(" ");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        if (strings[0].equals("-c")) {
            if (strings[2].equals("м"))
                allPeople.add(Person.createMale(strings[1],format.parse(strings[3])));
            if (strings[2].equals("ж"))
                allPeople.add(Person.createFemale(strings[1],format.parse(strings[3])));
            System.out.println(allPeople.size() - 1);
        }

        if (strings[0].equals("-u")) {
            allPeople.get(Integer.parseInt(strings[1])).setName(strings[2]);
            allPeople.get(Integer.parseInt(strings[1])).setBirthDay(format.parse(strings[4]));

            if (strings[3].equals("м"))
                allPeople.get(Integer.parseInt(strings[1])).setSex(Sex.MALE);
            else if(strings[3].equals("ж"))
                allPeople.get(Integer.parseInt(strings[1])).setSex(Sex.FEMALE);
        }

        if (strings[0].equals("-d")) {
            allPeople.get(Integer.parseInt(strings[1])).setName(null);
            allPeople.get(Integer.parseInt(strings[1])).setBirthDay(null);
            allPeople.get(Integer.parseInt(strings[1])).setSex(null);
        }

        if (strings[0].equals("-i")) {
            System.out.print(allPeople.get(Integer.parseInt(strings[1])).getName() + " ");
            if (allPeople.get(Integer.parseInt(strings[1])).getSex() == Sex.MALE)
                System.out.print("м" + " ");
            if (allPeople.get(Integer.parseInt(strings[1])).getSex() == Sex.FEMALE)
                System.out.print("ж" + " ");
            System.out.print(formatOut.format(allPeople.get(Integer.parseInt(strings[1])).getBirthDay()));
        }
    }
}
