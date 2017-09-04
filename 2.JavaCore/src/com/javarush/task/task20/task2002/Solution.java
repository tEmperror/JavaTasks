package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream(new File("F:/file.txt"));
            InputStream inputStream = new FileInputStream(new File("F:/file.txt"));

            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setFirstName("1");
            user.setLastName("2");
            user.setCountry(User.Country.RUSSIA);
            user.setMale(false);
            user.setBirthDate(new Date(100000));
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            System.out.println(loadedObject.equals(javaRush));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            for (User user : users) {
                printWriter.println(user.getFirstName() + " " + user.getLastName() + " " + user.getBirthDate().getTime() + " "
                + user.isMale() + " " + user.getCountry());
                System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getBirthDate().getTime() + " "
                        + user.isMale() + " " + user.getCountry());
            }
            printWriter.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                String[] s = reader.readLine().split(" ");
                User user = new User();
                user.setFirstName(s[0]);
                user.setLastName(s[1]);
                user.setBirthDate(new Date(Long.parseLong(s[2])));
                user.setMale(Boolean.parseBoolean(s[3]));
                if (s[4].equals("UKRAINE")) {
                    user.setCountry(User.Country.UKRAINE);
                }else if (s[4].equals("RUSSIA")) {
                    user.setCountry(User.Country.RUSSIA);
                }else {
                    user.setCountry(User.Country.OTHER);
                }

                users.add(user);
                System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getBirthDate().getTime() + " "
                        + user.isMale() + " " + user.getCountry());
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
