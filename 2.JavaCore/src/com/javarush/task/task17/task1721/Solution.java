package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(new File(reader.readLine())));
        BufferedReader reader2 = new BufferedReader(new FileReader(new File(reader.readLine())));

        String line;
        while ((line = reader1.readLine()) != null) {
            allLines.add(line);
        }
        while ((line = reader2.readLine()) != null) {
            forRemoveLines.add(line);
        }

        reader.close();
        reader1.close();
        reader2.close();

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
        }
    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines) == true) {
            allLines.removeAll(forRemoveLines);
        }else {
            allLines.removeAll(allLines);
            throw new CorruptedDataException();
        }
    }
}
