package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    public static void main(String[] args) {
    }

    public static class IncomeDataAdapter implements Customer, Contact{

        private IncomeData data;
        IncomeDataAdapter (IncomeData incomeData) {
            this.data = incomeData;
        }


        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getKey() == data.getCountryCode())
                    return entry.getValue();
            }
            return null;
        }

        @Override
        public String getName() {
            return (data.getContactLastName() + ", " + data.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {
            char[] number = new char[10];

            int j = 10 - String.valueOf(data.getPhoneNumber()).length();
            for (int i = 0; i < j; i++) {
                number[i] = '0';
            }

            for (int i = j; i < 10; i++) {
                number[i] = String.valueOf(data.getPhoneNumber()).toCharArray()[i - j];
            }

            return ("+" + data.getCountryPhoneCode() + "(" + number[0] + number[1] + number[2] + ")"
            + number[3] + number[4] + number[5] + "-" + number[6] + number[7] + "-" + number[8] + number[9]);
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}