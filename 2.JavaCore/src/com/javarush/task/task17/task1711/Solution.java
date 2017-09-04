package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c" : {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м"))
                            allPeople.add(Person.createMale(args[i], format.parse(args[i + 2])));
                        if (args[i + 1].equals("ж"))
                            allPeople.add(Person.createFemale(args[i], format.parse(args[i + 2])));
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            }
            case "-u" : {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDay(format.parse(args[i + 3]));
                        if (args[i + 2].equals("м"))
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                        else if (args[i + 2].equals("ж"))
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                    }
                }
                break;
            }
            case "-d" : {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDay(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                    }
                }
                break;
            }
            case "-i" : {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        System.out.print(allPeople.get(Integer.parseInt(args[i])).getName() + " ");
                        if (allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.MALE)
                            System.out.print("м" + " ");
                        if (allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.FEMALE)
                            System.out.print("ж" + " ");
                        System.out.println(formatOut.format(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
                    }
                }
                break;
            }
        }
    }
}
