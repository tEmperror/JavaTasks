package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grM1 = new Human("Haka", true, 66);
        Human grM2 = new Human("Maka", true, 67);
        Human grF1 = new Human("Hakaka", false, 77);
        Human grF2 = new Human("Makaka", false, 77);
        Human M = new Human("Elle",true, 35, grF1, grM1);
        Human F = new Human("Ellede",false, 35, grF2, grM2);
        Human ch1 = new Human("Elle1",true, 5, F, M);
        Human ch2 = new Human("Elle2",true, 5, F, M);
        Human ch3 = new Human("Elle3",true, 5, F, M);

        System.out.println(grM1.toString());
        System.out.println(grM2.toString());
        System.out.println(grF1.toString());
        System.out.println(grF2.toString());
        System.out.println(M.toString());
        System.out.println(F.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age,Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















