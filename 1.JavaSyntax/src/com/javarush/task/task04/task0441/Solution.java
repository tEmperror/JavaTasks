package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int a[] = {0,0,0};
        a[0] = Integer.parseInt(s1);
        a[1] = Integer.parseInt(s2);
        a[2] = Integer.parseInt(s3);

        Arrays.sort(a);
        System.out.println(a[1]);
    }
}
