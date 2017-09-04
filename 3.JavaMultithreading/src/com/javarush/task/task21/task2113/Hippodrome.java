package com.javarush.task.task21.task2113;

import java.util.LinkedList;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses = new LinkedList<>();
    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            horses.add(new Horse("" + i, 3.0, 0.0 ));
        }
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;

    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void run() throws InterruptedException {
        for (int i = 1; i < 101; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner() {
        double max = 0;
        for (Horse horse : horses) {
            if (horse.distance > max) max = horse.distance;
        }
        for (Horse horse : horses) {
            if (horse.distance == max) return horse;
        }
        return null;
    }

    public void printWinner() {
        System.out.print("Winner is " + getWinner().getName() + "!");
    }
}
