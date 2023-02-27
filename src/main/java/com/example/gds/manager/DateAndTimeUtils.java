package com.example.gds.manager;


import java.time.LocalDate;

public class DateAndTimeUtils {

    private final int[][] workingDays = new int[6][7];

    public int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31*m)/12) % 7;
    }

    public boolean isLeapYear(int year) {
        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
        return year % 400 == 0;
    }

    public int[][] getWorkingDays(LocalDate myDate) {

        for (int i = 0; i < workingDays.length; i++) {
            for (int j = 0; j < workingDays[0].length; j++) {
                workingDays[i][j] = 0;
            }
        }

        int monthValue = myDate.getMonthValue();
        int year = myDate.getYear();

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (monthValue == 2 && isLeapYear(year)) days[monthValue] = 29;

        int d = day(monthValue, 0, year);

        int[][] date = new int[6][7];
        int[] daysOfMonth = new int[days[monthValue] + 1];
        for (int i = 1; i <= days[monthValue]; i++) {
            daysOfMonth[i] = i;
        }

        int m = days[monthValue];
        for (int i = d - 1; i >= 0; i--) {
            date[0][i] = m;
            m--;
        }

        int k = 1;
        for (int i = 0; i < date.length; i++) {
            for (int j = 0; j < date[0].length; j++) {
                if (date[i][j] == 0 && k < days[monthValue] + 1) {
                    date[i][j] = daysOfMonth[k];
                    k++;
                    workingDays[i][j] = date[i][j];
                }
            }
        }
        return workingDays;
    }

    public int[][] getCalendar(LocalDate myDate) {

        int monthValue = myDate.getMonthValue();
        int year = myDate.getYear();

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (monthValue == 2 && isLeapYear(year)) days[monthValue] = 29;

        int d = day(monthValue, 0, year);

        int[][] date = new int[6][7];
        int[] daysOfMonth = new int[days[monthValue] + 1];
        for (int i = 1; i <= days[monthValue]; i++) {
            daysOfMonth[i] = i;
        }

        int m = days[monthValue];
        for (int i = d - 1; i >= 0; i--) {
            date[0][i] = m;
            m--;
        }

        int k = 1;
        int l = 1;
        for (int i = 0; i < date.length; i++) {
            for (int j = 0; j < date[0].length; j++) {
                if (date[i][j] == 0 && k < days[monthValue] + 1) {
                    date[i][j] = daysOfMonth[k];
                    k++;
                    workingDays[i][j] = date[i][j];
                } else if (date[i][j] == 0) {
                    date[i][j] = l;
                    l++;
                }
            }
        }
        return date;
    }

}
