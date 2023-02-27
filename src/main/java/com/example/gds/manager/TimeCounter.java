package com.example.gds.manager;


import java.util.HashMap;
import java.util.Map;

public class TimeCounter {

    public HashMap<String, Integer> count(String[][] checkData, int[][] workingDays) {

        int hours = 0;
        int nightHours = 0;
        int holidayHours = 0;
        int vacationDays = 0;
        int vacationHours = 0;
        int vacationPayDays = 0;
        int monthlyHours = 0;
        int absMonthlyHours = 0;
        int absNumWorkDays = 0;
        int weekEndHours = 0;

        HashMap<String, Integer> timeCount = new HashMap<>();

        int p = 1;
        int[][] lastDays = new int[6][7];
        for (int i = checkData.length - 2; i < checkData.length; i++) {
            for (int j = 0; j < checkData[0].length; j++) {
                if (workingDays[i][j] == 0) {
                    lastDays[i][j] = p;
                    p++;
                }
            }
        }

        int iNext = 0;
        int jNext = 1;
        for (int i = 0; i < checkData.length; i++) {
            for (int j = 0; j < checkData[0].length; j++) {
                if(workingDays[i][j] != 0 && checkData[i][j].matches("S|1S|2S|3S|4S") && checkData[iNext][jNext].matches("4|4S")) {
                    holidayHours += 2;
                }
                if(workingDays[i][j] != 0 && lastDays[i][j] <= 0 && checkData[iNext][jNext].matches("4|4S")) {
                    hours += 2;
                    nightHours += 2;
                }
                jNext++;
                if (jNext == checkData[0].length) {
                    jNext = 0;
                    iNext++;
                }
            }
        }

        int numWorkDays = 0;
        absNumWorkDays = 0;
        for (int i = 0; i < checkData.length; i++) {
            for (int j = 0; j < checkData[0].length - 2; j++) {
                if(workingDays[i][j] != 0 && checkData[i][j].matches("1|5")) {
                    hours += 4;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("[2-3]|[6-7]|I|Z")) {
                    hours += 6;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("4")) {
                    hours += 6;
                    nightHours += 6;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("1S")) {
                    hours += 4;
                    holidayHours += 4;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("2S|3S")) {
                    hours += 6;
                    holidayHours += 6;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("4S")) {
                    hours += 6;
                    nightHours += 6;
                    holidayHours += 6;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("ED|O|B|M|AS")) {
                    vacationHours += 6;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("C")) {
                    vacationPayDays += 1;
                    vacationDays += 1;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("8")) {
                    hours += 8;
                }
                if (workingDays[i][j] != 0) {
                    numWorkDays++;
                    absNumWorkDays++;
                }
                if(workingDays[i][j] != 0 && checkData[i][j].matches("S|1S|2S|3S|4S|C|ED|O|B|M|AS")) {
                    numWorkDays--;
                }
                if(workingDays[i][j] != 0 && checkData[i][j].matches("S|1S|2S|3S|4S")) {
                    absNumWorkDays--;
                }
            }
        }
        monthlyHours = numWorkDays * 6;
        absMonthlyHours = absNumWorkDays * 6;

        iNext = 0;
        jNext = checkData[0].length - 1;
        weekEndHours = 0;
        for (int i = 0; i < checkData.length; i++) {
            for (int j = checkData[0].length - 2; j < checkData[0].length; j++) {
                if(workingDays[i][j] != 0 && checkData[i][j].matches("1")) {
                    weekEndHours += 4;
                    hours += 4;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("[2-3]")) {
                    weekEndHours += 6;
                    hours += 6;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("4")) {
                    weekEndHours += 6;
                    hours += 6;
                    nightHours += 6;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("1S")) {
                    hours += 4;
                    weekEndHours += 4;
                    holidayHours += 4;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("2S|3S")) {
                    hours += 6;
                    weekEndHours += 6;
                    holidayHours += 6;
                } else if(workingDays[i][j] != 0 && checkData[i][j].matches("4S")) {
                    hours += 6;
                    weekEndHours += 6;
                    nightHours += 6;
                    holidayHours += 6;
                }
                if(workingDays[i][j] != 0 && lastDays[i][j] <= 0 && checkData[iNext][jNext].matches("4|4S")) {
                    weekEndHours += 2;
                }
                jNext++;
                if (jNext == checkData[0].length) {
                    jNext = 0;
                    iNext++;
                }
                if (jNext == 1) {
                    jNext = checkData[i].length - 1;
                }
            }
        }

        timeCount.put("hours", hours);
        timeCount.put("nightHours", nightHours);
        timeCount.put("holidayHours", holidayHours);
        timeCount.put("vacationDays", vacationDays);
        timeCount.put("vacationHours", vacationHours);
        timeCount.put("vacationPayDays", vacationPayDays);
        timeCount.put("monthlyHours", monthlyHours);
        timeCount.put("absMonthlyHours", absMonthlyHours);
        timeCount.put("absNumWorkDays", absNumWorkDays);
        timeCount.put("weekEndHours", weekEndHours);

        return timeCount;
    }

    public int getCertainTime (Map<String, Integer> certainTime, String name) {
        for (Map.Entry<String, Integer> entry : certainTime.entrySet()) {
            if (entry.getKey().equals(name)) {
                return entry.getValue();
            }
        }
        return 0;
    }

}
