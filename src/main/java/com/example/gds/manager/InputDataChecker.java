package com.example.gds.manager;


import javafx.scene.control.TextField;

public class InputDataChecker {

    public String checkInput(TextField inputText) {
        String s = "";
        try {
            if (inputText.getText() != null) {
                s = inputText.getText();
            }
        } catch (Exception e) {
            s = "";
        }
        return s.toUpperCase();
    }

    public boolean checkValueInput(TextField inputText) {
        return !inputText.getText().matches("-?\\d*\\.?\\d+");
    }

    public boolean checkIntegerValueInput(TextField inputText) {
        return !inputText.getText().matches("^$|\\d+");
    }

    public boolean checkAllDates(String[][] checkData) {
        for (int i = 0; i < checkData.length; i++) {
            for (int j = 0; j < checkData[0].length; j++) {
                if (!checkData[i][j].matches("| |[1-8]|S|1S|2S|3S|4S|C|I|Z|ED|O|B|N|CFP|M|AS")) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkWeekendDates(String[][] checkData) {
        for (int i = 0; i < checkData.length; i++) {
            for (int j = checkData[0].length - 2; j < checkData[0].length; j++) {
                if(!checkData[i][j].matches("| |[1-4]|S|1S|2S|3S|4S")) {
                    return true;
                }
            }
        }
        return false;
    }
}
