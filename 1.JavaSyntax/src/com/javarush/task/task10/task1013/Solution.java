package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private String dog1;
        private String dog2;
        private String dog3;

        public Human(String name) {
            this.name = name;
            this.age = 60;
            this.sex = false;
            this.dog1 = "P1";
            this.dog2 = "P2";
            this.dog3 = "P3";
        }
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
            this.sex = false;
            this.dog1 = "P1";
            this.dog2 = "P2";
            this.dog3 = "P3";
        }
        public Human(int age) {
            this.name = "name";
            this.age = age;
            this.sex = false;
            this.dog1 = "P1";
            this.dog2 = "P2";
            this.dog3 = "P3";
        }
        public Human(String name, boolean sex) {
            this.name = name;
            this.age = 60;
            this.sex = sex;
            this.dog1 = "P1";
            this.dog2 = "P2";
            this.dog3 = "P3";
        }
        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.dog1 = "P1";
            this.dog2 = "P2";
            this.dog3 = "P3";
        }
        public Human(String name, int age, boolean sex, String dog1) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.dog1 = dog1;
            this.dog2 = "P2";
            this.dog3 = "P3";
        }
        public Human(String name, String dog1) {
            this.name = name;
            this.age = 60;
            this.sex = false;
            this.dog1 = dog1;
            this.dog2 = "P2";
            this.dog3 = "P3";
        }
        public Human(String name, String dog1, String dog2) {
            this.name = name;
            this.age = 60;
            this.sex = false;
            this.dog1 = dog1;
            this.dog2 = dog2;
            this.dog3 = "P3";
        }
        public Human(int age, String dog2) {
            this.name = "name";
            this.age = age;
            this.sex = false;
            this.dog1 = "p";
            this.dog2 = dog2;
            this.dog3 = "P3";
        }
        public Human(int age, boolean sex) {
            this.name = "name";
            this.age = age;
            this.sex = sex;
            this.dog1 = "P1";
            this.dog2 = "P2";
            this.dog3 = "p";
        }
    }
}
