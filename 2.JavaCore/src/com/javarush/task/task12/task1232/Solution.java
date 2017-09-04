package com.javarush.task.task12.task1232;

/* 
Нужно добавить в программу новую функциональность
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static interface Fly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static abstract class Pegas extends Horse implements Fly {
    }
}
