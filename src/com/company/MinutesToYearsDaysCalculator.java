package com.company;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }else {

            long years = 0;
            long days = 0;
            long hours = 0;

            if (minutes >= 60) {
                hours = minutes / 60;
            }

            if (hours >= 24) {
                days = hours / 24;
                hours = hours - (24 * days);
            }

            if (days >= 365) {
                years = days / 365;
                days = days - (365 * years);
            }

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

}
