package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human GrP1 = new Human();
        Human GrP2 = new Human();
        Human GrM1 = new Human();
        Human GrM2 = new Human();
        Human M = new Human();
        Human P = new Human();
        Human ch1 = new Human();
        Human ch2 = new Human();
        Human ch3 = new Human();

        GrP1.name = "name1";
        GrP2.name = "name2";
        GrM1.name = "name3";
        GrM2.name = "name4";
        M.name = "name5";
        P.name = "name6";
        ch1.name = "name7";
        ch2.name = "name8";
        ch3.name = "name9";

        GrP1.sex = true;
        GrM1.sex = false;
        GrP2.sex = true;
        GrM2.sex = false;
        P.sex = true;
        M.sex = false;
        ch1.sex = false;
        ch2.sex = false;
        ch3.sex = false;

        GrP1.age = 66;
        GrP2.age = 66;
        GrM1.age = 66;
        GrM2.age = 66;
        P.age = 66;
        M.age = 66;
        ch1.age = 66;
        ch2.age = 66;
        ch3.age = 66;

        GrP1.children.add(M);
        GrM1.children.add(M);
        GrP2.children.add(P);
        GrM2.children.add(P);
        M.children.add(ch1);
        M.children.add(ch2);
        M.children.add(ch3);
        P.children.add(ch1);
        P.children.add(ch2);
        P.children.add(ch3);

        System.out.println(GrP1.toString());
        System.out.println(GrP2.toString());
        System.out.println(GrM1.toString());
        System.out.println(GrM2.toString());
        System.out.println(M.toString());
        System.out.println(P.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
