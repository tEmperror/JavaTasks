package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            Thread thread = Thread.currentThread();

            while (countSeconds > 1) {
                System.out.println(countSeconds + " ");
                countSeconds--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                System.out.println(countSeconds + " ");
                Thread.sleep(1000);
                if (!thread.isInterrupted()) System.out.println("Марш!");
            } catch (Exception e) {
                System.out.println("Прервано!");
            }
        }
    }
}
