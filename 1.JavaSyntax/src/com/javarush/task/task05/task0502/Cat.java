package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int sum1 = age + weight + strength;
        int sum2 = anotherCat.age + anotherCat.weight + anotherCat.strength;

        if (sum1 > sum2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
