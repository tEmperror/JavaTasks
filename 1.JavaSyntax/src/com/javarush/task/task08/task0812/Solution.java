package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        Integer a = list.get(0);
        int Coll = 0;
        int mColl = 0;
        for (int i = 0; i < 10; i++) {
            if (list.get(i) == a) {
                Coll++;
                if (Coll > mColl) {
                    mColl = Coll;
                }
            }else {
                if (Coll > mColl) {
                    mColl = Coll;
                }
                Coll = 1;
                a = list.get(i);
            }
        }

        System.out.println(mColl);
    }
}