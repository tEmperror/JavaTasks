package com.javarush.task.task20.task2025;

import java.util.ArrayList;

/*
Алгоритмы-числа
*/
public class Solution {
    public static ArrayList<Long> list = new ArrayList<>();

    public static long[] getNumbers(long N) throws InterruptedException {
        new numbers(1, N / 5);
        new numbers((N/5)+1, N/5*2);
        new numbers((N/5*2)+1, N/5*3);
        new numbers((N/5*3)+1, N/5*4);
        new numbers((N/5*4)+1, N);
        //Thread.sleep(1000);
        long[] result = new long[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        long[] result = getNumbers(Integer.MAX_VALUE);
        for (long l : result) {
            System.out.println(l);
        }
    }
}

class numbers extends Thread {
    long N;
    long M;

    public numbers(long M, long N) {
        this.N = N;
        this.M = M;
        this.start();
    }

    @Override
    public void run() {
        for (long i = M; i < N; i++) {
            int M = (int) Math.ceil(Math.log10(i + 0.5)); //число разрядов в числе
            long sum = 0;                                 //сумма степеней разрядов
            long ii = i;
            for (int j = 1; j <= M; j++) {
                sum += Math.pow((long)(ii / (Math.pow(10, M - j))),M);
                ii = (long) (ii % (Math.pow(10, M - j)));
            }
            if (sum == i) {
                Solution.list.add(i);
                System.out.println(i);
            }
        }
    }
}

