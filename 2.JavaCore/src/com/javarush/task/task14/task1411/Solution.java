package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> list = new LinkedList<>();
        boolean flag = true;

        while (flag) {
            key = reader.readLine();
            if (key.equals("user")) {
                list.add(key);
            } else if (key.equals("loser")) {
                list.add(key);
            } else if (key.equals("coder")) {
                list.add(key);
            } else if (key.equals("proger")) {
                list.add(key);
            } else flag = false;
        }

        for (String s : list) {
            if (s.equals("user")) {
                doWork(new Person.User());
            } else if (s.equals("loser")) {
                doWork(new Person.Loser());
            } else if (s.equals("coder")) {
                doWork(new Person.Coder());
            } else if (s.equals("proger")) {
                doWork(new Person.Coder());
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }else if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        }else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
