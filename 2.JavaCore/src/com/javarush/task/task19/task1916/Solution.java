package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader file1Read = new BufferedReader(new FileReader(file1));
        BufferedReader file2Read = new BufferedReader(new FileReader(file2));
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        while (file1Read.ready()) {
            list1.add(file1Read.readLine().replaceAll("\\n\\tetc.", ""));
        }
        while (file2Read.ready()) {
            list2.add(file2Read.readLine().replaceAll("\\n\\tetc.", ""));
        }
        file1Read.close();
        file2Read.close();

        for (int i = 0; i < list1.size(); i++) {
            if (list2.size() == 0) {
                lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                break;
            }

            if (list1.get(i).contentEquals(list2.get(0))) {
                lines.add(new LineItem(Type.SAME, list1.get(i)));
                list2.remove(0);
            }
            else {
                if (list2.size() > 1) {
                    if (list1.get(i).contentEquals(list2.get(1))) {
                        lines.add(new LineItem(Type.ADDED, list2.get(0)));
                        list2.remove(0);
                        i--;
                    } else if (list1.get(i + 1).contentEquals(list2.get(0))) {
                        lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                    }
                }else {
                    if (list1.get(i + 1).contentEquals(list2.get(0))) {
                        lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                    }
                }
            }

            if ((i == list1.size() - 1) && (list2.size() == 1)) {
                lines.add(new LineItem(Type.ADDED, list2.get(0)));
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
