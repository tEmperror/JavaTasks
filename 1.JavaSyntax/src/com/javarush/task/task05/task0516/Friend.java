package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
*/

public class Friend {
    public String name;
    public int age;
    public char sex;

    public Friend(String name) {
        this.name = name;
        this.age = 20;
        this.sex = 'w';
    }
    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
        this.sex = 'w';
    }
    public Friend(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}