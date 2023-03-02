package com.example.gds;


import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.ResourceBundle;
import com.example.gds.manager.DateAndTimeUtils;
import com.example.gds.manager.InputDataChecker;
import com.example.gds.manager.TimeCounter;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import com.example.gds.manager.Payment;

public class Controller {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Button calcBtn;
    @FXML
    private Label date00;
    @FXML
    private Label date01;
    @FXML
    private Label date02;
    @FXML
    private Label date03;
    @FXML
    private Label date04;
    @FXML
    private Label date05;
    @FXML
    private Label date06;
    @FXML
    private Label date10;
    @FXML
    private Label date11;
    @FXML
    private Label date12;
    @FXML
    private Label date13;
    @FXML
    private Label date14;
    @FXML
    private Label date15;
    @FXML
    private Label date16;
    @FXML
    private Label date20;
    @FXML
    private Label date21;
    @FXML
    private Label date22;
    @FXML
    private Label date23;
    @FXML
    private Label date24;
    @FXML
    private Label date25;
    @FXML
    private Label date26;
    @FXML
    private Label date30;
    @FXML
    private Label date31;
    @FXML
    private Label date32;
    @FXML
    private Label date33;
    @FXML
    private Label date34;
    @FXML
    private Label date35;
    @FXML
    private Label date36;
    @FXML
    private Label date40;
    @FXML
    private Label date41;
    @FXML
    private Label date42;
    @FXML
    private Label date43;
    @FXML
    private Label date44;
    @FXML
    private Label date45;
    @FXML
    private Label date46;
    @FXML
    private Label date50;
    @FXML
    private Label date51;
    @FXML
    private Label date52;
    @FXML
    private Label date53;
    @FXML
    private Label date54;
    @FXML
    private Label date55;
    @FXML
    private Label date56;
    @FXML
    private Label errorLabel;
    @FXML
    private Label monthlyHoursLabel;
    @FXML
    private Label weekendHoursLabel;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField extraHoursField;
    @FXML
    private Label grossPayLabel;
    @FXML
    private Label holidayHoursLabel;
    @FXML
    private TextField holidayPassiveShifts;
    @FXML
    private TextField nameField;
    @FXML
    private Label netPay;
    @FXML
    private Label nightHoursLabel;
    @FXML
    private Label realHours;
    @FXML
    private TextField salaryField;
    @FXML
    private TextField shift00;
    @FXML
    private TextField shift01;
    @FXML
    private TextField shift02;
    @FXML
    private TextField shift03;
    @FXML
    private TextField shift04;
    @FXML
    private TextField shift05;
    @FXML
    private TextField shift06;
    @FXML
    private TextField shift10;
    @FXML
    private TextField shift11;
    @FXML
    private TextField shift12;
    @FXML
    private TextField shift13;
    @FXML
    private TextField shift14;
    @FXML
    private TextField shift15;
    @FXML
    private TextField shift16;
    @FXML
    private TextField shift20;
    @FXML
    private TextField shift21;
    @FXML
    private TextField shift22;
    @FXML
    private TextField shift23;
    @FXML
    private TextField shift24;
    @FXML
    private TextField shift25;
    @FXML
    private TextField shift26;
    @FXML
    private TextField shift30;
    @FXML
    private TextField shift31;
    @FXML
    private TextField shift32;
    @FXML
    private TextField shift33;
    @FXML
    private TextField shift34;
    @FXML
    private TextField shift35;
    @FXML
    private TextField shift36;
    @FXML
    private TextField shift40;
    @FXML
    private TextField shift41;
    @FXML
    private TextField shift42;
    @FXML
    private TextField shift43;
    @FXML
    private TextField shift44;
    @FXML
    private TextField shift45;
    @FXML
    private TextField shift46;
    @FXML
    private TextField shift50;
    @FXML
    private TextField shift51;
    @FXML
    private TextField shift52;
    @FXML
    private TextField shift53;
    @FXML
    private TextField shift54;
    @FXML
    private TextField shift55;
    @FXML
    private TextField shift56;
    @FXML
    private TextField totalPassiveShifts;
    @FXML
    private Button resetBtn;
    @FXML
    private Button helpButton;
    @FXML
    private Button payslipButton;
    @FXML
    private TextField nextMonthShiftsField;
    @FXML
    private TextField distanceFromHomeField;
    private LocalDate myDate;
    private double baseMonthlySalaryPayment;
    private double nightWorkPayment;
    private double nightWorkXPayment;
    private double weekEndWorkPayment;
    private double weekEndWorkXPayment;
    private double holidayWorkPayment;
    private double holidayXPayment;
    private double specialVacationPayment;
    private double specialVacationXPayment;
    private double vacationPay;
    private double vacationPayX;
    private double compensatoryAddTax;
    private double passiveHoursPayment;
    private double passiveHoursXPayment;
    private double holidayPassiveHoursPayment;
    private double holidayPassiveHoursXPayment;
    private double privateHealthInsurancePayment;
    private double optionalPensionER;
    private double workCommutePayment;
    private double mealTicketsPayment;
    private double mealTicketValue;
    private double overTimePay;
    private double overTimePayX;
    private double grossPay;
    private double socialInsBaseEE;
    private double healthInsBaseEE;
    private double socialInsuranceEE;
    private double socialInsuranceEEX;
    private double healthInsuranceEE;
    private double healthInsuranceEEX;
    private double syndicateCost;
    private double optionalPensionEE;
    private double netTaxBase;
    private double totalTax;
    private double totalTaxX;
    private double netLegalPay;
    private double paymentAmount;
    private double baseSalary = 0.0;
    private int passiveShifts = 0;
    private int holyPassiveShifts = 0;
    private int distanceFromHome = 0;
    int hours;
    int nightHours;
    int holidayHours;
    int vacationDays;
    int vacationPayDays;
    int weekEndHours;
    int holyPassiveHours;
    int passiveHours;
    int extraHours;
    int nextMonthShifts;
    int absMonthlyHours;
    int monthlyHours;
    int vacationHours;

    private final InputDataChecker inputDataChecker = new InputDataChecker();

    private final TimeCounter timeCounter = new TimeCounter();

    private final DateAndTimeUtils dateAndTimeUtils = new DateAndTimeUtils();

    private final Payment payment = new Payment();

    public void reset() {
        shift00.setText("");
        shift01.setText("");
        shift02.setText("");
        shift03.setText("");
        shift04.setText("");
        shift05.setText("");
        shift06.setText("");
        shift10.setText("");
        shift11.setText("");
        shift12.setText("");
        shift13.setText("");
        shift14.setText("");
        shift15.setText("");
        shift16.setText("");
        shift20.setText("");
        shift21.setText("");
        shift22.setText("");
        shift23.setText("");
        shift24.setText("");
        shift25.setText("");
        shift26.setText("");
        shift30.setText("");
        shift31.setText("");
        shift32.setText("");
        shift33.setText("");
        shift34.setText("");
        shift35.setText("");
        shift36.setText("");
        shift40.setText("");
        shift41.setText("");
        shift42.setText("");
        shift43.setText("");
        shift44.setText("");
        shift45.setText("");
        shift46.setText("");
        shift50.setText("");
        shift51.setText("");
        shift52.setText("");
        shift53.setText("");
        shift54.setText("");
        shift55.setText("");
        shift56.setText("");
        extraHoursField.setText("");
        holidayPassiveShifts.setText("");
        totalPassiveShifts.setText("");
        salaryField.setText("");
        nameField.setText("");
        realHours.setText("");
        nightHoursLabel.setText("");
        holidayHoursLabel.setText("");
        weekendHoursLabel.setText("");
        monthlyHoursLabel.setText("");
        grossPayLabel.setText("");
        netPay.setText("");
        errorLabel.setText("");
    }

    public void getDate() {

        myDate = datePicker.getValue();

        int[][] date = dateAndTimeUtils.getCalendar(myDate);

        date00.setText("" + date[0][0]);
        date01.setText("" + date[0][1]);
        date02.setText("" + date[0][2]);
        date03.setText("" + date[0][3]);
        date04.setText("" + date[0][4]);
        date05.setText("" + date[0][5]);
        date06.setText("" + date[0][6]);
        date10.setText("" + date[1][0]);
        date11.setText("" + date[1][1]);
        date12.setText("" + date[1][2]);
        date13.setText("" + date[1][3]);
        date14.setText("" + date[1][4]);
        date15.setText("" + date[1][5]);
        date16.setText("" + date[1][6]);
        date20.setText("" + date[2][0]);
        date21.setText("" + date[2][1]);
        date22.setText("" + date[2][2]);
        date23.setText("" + date[2][3]);
        date24.setText("" + date[2][4]);
        date25.setText("" + date[2][5]);
        date26.setText("" + date[2][6]);
        date30.setText("" + date[3][0]);
        date31.setText("" + date[3][1]);
        date32.setText("" + date[3][2]);
        date33.setText("" + date[3][3]);
        date34.setText("" + date[3][4]);
        date35.setText("" + date[3][5]);
        date36.setText("" + date[3][6]);
        date40.setText("" + date[4][0]);
        date41.setText("" + date[4][1]);
        date42.setText("" + date[4][2]);
        date43.setText("" + date[4][3]);
        date44.setText("" + date[4][4]);
        date45.setText("" + date[4][5]);
        date46.setText("" + date[4][6]);
        date50.setText("" + date[5][0]);
        date51.setText("" + date[5][1]);
        date52.setText("" + date[5][2]);
        date53.setText("" + date[5][3]);
        date54.setText("" + date[5][4]);
        date55.setText("" + date[5][5]);
        date56.setText("" + date[5][6]);

    }

    public String[][] getDataText() {
        String[][] checkData = new String[6][7];

        checkData[0][0] = inputDataChecker.checkInput(shift00);
        checkData[0][1] = inputDataChecker.checkInput(shift01);
        checkData[0][2] = inputDataChecker.checkInput(shift02);
        checkData[0][3] = inputDataChecker.checkInput(shift03);
        checkData[0][4] = inputDataChecker.checkInput(shift04);
        checkData[0][5] = inputDataChecker.checkInput(shift05);
        checkData[0][6] = inputDataChecker.checkInput(shift06);
        checkData[1][0] = inputDataChecker.checkInput(shift10);
        checkData[1][1] = inputDataChecker.checkInput(shift11);
        checkData[1][2] = inputDataChecker.checkInput(shift12);
        checkData[1][3] = inputDataChecker.checkInput(shift13);
        checkData[1][4] = inputDataChecker.checkInput(shift14);
        checkData[1][5] = inputDataChecker.checkInput(shift15);
        checkData[1][6] = inputDataChecker.checkInput(shift16);
        checkData[2][0] = inputDataChecker.checkInput(shift20);
        checkData[2][1] = inputDataChecker.checkInput(shift21);
        checkData[2][2] = inputDataChecker.checkInput(shift22);
        checkData[2][3] = inputDataChecker.checkInput(shift23);
        checkData[2][4] = inputDataChecker.checkInput(shift24);
        checkData[2][5] = inputDataChecker.checkInput(shift25);
        checkData[2][6] = inputDataChecker.checkInput(shift26);
        checkData[3][0] = inputDataChecker.checkInput(shift30);
        checkData[3][1] = inputDataChecker.checkInput(shift31);
        checkData[3][2] = inputDataChecker.checkInput(shift32);
        checkData[3][3] = inputDataChecker.checkInput(shift33);
        checkData[3][4] = inputDataChecker.checkInput(shift34);
        checkData[3][5] = inputDataChecker.checkInput(shift35);
        checkData[3][6] = inputDataChecker.checkInput(shift36);
        checkData[4][0] = inputDataChecker.checkInput(shift40);
        checkData[4][1] = inputDataChecker.checkInput(shift41);
        checkData[4][2] = inputDataChecker.checkInput(shift42);
        checkData[4][3] = inputDataChecker.checkInput(shift43);
        checkData[4][4] = inputDataChecker.checkInput(shift44);
        checkData[4][5] = inputDataChecker.checkInput(shift45);
        checkData[4][6] = inputDataChecker.checkInput(shift46);
        checkData[5][0] = inputDataChecker.checkInput(shift50);
        checkData[5][1] = inputDataChecker.checkInput(shift51);
        checkData[5][2] = inputDataChecker.checkInput(shift52);
        checkData[5][3] = inputDataChecker.checkInput(shift53);
        checkData[5][4] = inputDataChecker.checkInput(shift54);
        checkData[5][5] = inputDataChecker.checkInput(shift55);
        checkData[5][6] = inputDataChecker.checkInput(shift56);

        return checkData;
    }

    private void checkSalaryField() {
        if (inputDataChecker.checkValueInput(salaryField)) {
            errorLabel.setText("Pentru salariul de baza introduceti doar cifre sau folositi \".\" pentru zecimale!");
        } else baseSalary = Double.parseDouble(salaryField.getText());
    }

    private void checkDataFields() {
        if (inputDataChecker.checkAllDates(getDataText()) || inputDataChecker.checkWeekendDates(getDataText())) {
            errorLabel.setText("Pentru ture verificati corectitudinea datelor introduse!");
        } else errorLabel.setText("");
    }

    private void checkTotalPassiveShiftsField() {
        if (inputDataChecker.checkIntegerValueInput(totalPassiveShifts)) {
            errorLabel.setText("Pentru Numar total ture Consemn introduceti doar cifre intregi!");
        } else if (!totalPassiveShifts.getText().isEmpty()) {
            passiveShifts = Integer.parseInt(totalPassiveShifts.getText());
        }
    }

    private void checkHolidayPassiveShiftsField() {
        if (inputDataChecker.checkIntegerValueInput(holidayPassiveShifts)) {
            errorLabel.setText("Pentru ture consemn sarbatoare introduceti doar cifre intregi!");
        } else if (!holidayPassiveShifts.getText().isEmpty()) {
            holyPassiveShifts = Integer.parseInt(holidayPassiveShifts.getText());
        }
    }

    private void checkExtraHoursField() {
        if (inputDataChecker.checkIntegerValueInput(extraHoursField)) {
            errorLabel.setText("Pentru Ore suplimentare introduceti doar cifre intregi");
        } else if (!extraHoursField.getText().isEmpty()) {
            extraHours = Integer.parseInt(extraHoursField.getText());
        }
    }

    private void checkNextMonthField() {
        if (inputDataChecker.checkIntegerValueInput(nextMonthShiftsField)) {
            errorLabel.setText("Pentru Numar ture luna viitoare introduceti doar cifre intregi");
        } else if (!nextMonthShiftsField.getText().isEmpty()) {
            nextMonthShifts = Integer.parseInt(nextMonthShiftsField.getText());
        }
    }

    private void checkDistanceFromHomeField() {
        if (inputDataChecker.checkIntegerValueInput(distanceFromHomeField)) {
            errorLabel.setText("Pentru Distanta domiciliu - serviciu introduceti doar cifre intregi");
        } else if (!distanceFromHomeField.getText().isEmpty()) {
            distanceFromHome = Integer.parseInt(distanceFromHomeField.getText());
        }
    }

    public void calc() {

        if (myDate == null) {
            datePicker.setValue(LocalDate.now());
        }

        checkDataFields();

        int[][] workingDays = dateAndTimeUtils.getWorkingDays(myDate);

        HashMap<String, Integer> timeCount = timeCounter.count(getDataText(), workingDays);

        hours = timeCounter.getCertainTime(timeCount, "hours");
        nightHours = timeCounter.getCertainTime(timeCount, "nightHours");
        holidayHours = timeCounter.getCertainTime(timeCount, "holidayHours");
        vacationDays = timeCounter.getCertainTime(timeCount, "vacationDays");
        vacationHours = timeCounter.getCertainTime(timeCount, "vacationHours");
        vacationPayDays = timeCounter.getCertainTime(timeCount, "vacationPayDays");
        monthlyHours = timeCounter.getCertainTime(timeCount, "monthlyHours");
        absMonthlyHours = timeCounter.getCertainTime(timeCount, "absMonthlyHours");
        int absNumWorkDays = timeCounter.getCertainTime(timeCount, "absNumWorkDays");
        weekEndHours = timeCounter.getCertainTime(timeCount, "weekEndHours");

        monthlyHoursLabel.setText("" + monthlyHours);

        checkSalaryField();

        checkTotalPassiveShiftsField();

        checkHolidayPassiveShiftsField();

        holyPassiveHours = holyPassiveShifts * 8;

        if (passiveShifts < holyPassiveShifts) {
            errorLabel.setText("Numarul turelor de consemn sarbatoare nu poate depasi numarul total de ture!");
        }
        passiveShifts -= holyPassiveShifts;
        passiveHours = passiveShifts * 8;

        extraHours = 0;

        checkExtraHoursField();

        nextMonthShifts = 0;

        checkNextMonthField();

        checkDistanceFromHomeField();

        realHours.setText("" + hours);
        nightHoursLabel.setText("" + nightHours);
        weekendHoursLabel.setText("" + weekEndHours);
        holidayHoursLabel.setText("" + holidayHours);

        baseMonthlySalaryPayment = payment.getBaseMonthlySalary(baseSalary, absMonthlyHours, monthlyHours, hours);
        nightWorkXPayment = payment.getNightWorkX(baseMonthlySalaryPayment, absMonthlyHours);
        nightWorkPayment = payment.getNightWork(baseMonthlySalaryPayment, absMonthlyHours, nightHours);
        weekEndWorkXPayment = payment.getWeekEndWorkX(baseMonthlySalaryPayment, absMonthlyHours);
        weekEndWorkPayment = payment.getWeekEndWork(baseMonthlySalaryPayment, absMonthlyHours, weekEndHours);
        holidayXPayment = payment.getHolidayX(baseMonthlySalaryPayment, absMonthlyHours);
        holidayWorkPayment = payment.getHolidayWork(baseMonthlySalaryPayment, absMonthlyHours, holidayHours);
        specialVacationXPayment = payment.getSpecialVacationX(baseSalary, absMonthlyHours);
        specialVacationPayment = payment.getSpecialVacation(baseSalary, absMonthlyHours, vacationHours);
        vacationPayX = payment.getVacationPayX(baseSalary, absMonthlyHours, nightHours, passiveHours, holyPassiveHours, absNumWorkDays);
        vacationPay = payment.getVacationPay(vacationPayX, vacationPayDays);
        compensatoryAddTax = payment.getCompensatoryTaxAdd(baseMonthlySalaryPayment, absMonthlyHours, monthlyHours);
        passiveHoursXPayment = payment.getPassiveHoursX(baseMonthlySalaryPayment, absMonthlyHours);
        passiveHoursPayment = payment.getPassiveHours(baseMonthlySalaryPayment, absMonthlyHours, passiveHours);
        holidayPassiveHoursXPayment = payment.getHolyPassiveHoursX(baseMonthlySalaryPayment, absMonthlyHours);
        holidayPassiveHoursPayment = payment.getHolyPassiveHours(baseMonthlySalaryPayment, absMonthlyHours, holyPassiveHours);
        privateHealthInsurancePayment = payment.getPrivateHealthInsurance(baseMonthlySalaryPayment);
        optionalPensionER = payment.getOptionalPensionER(baseMonthlySalaryPayment);
        workCommutePayment = payment.getWorkCommute(nextMonthShifts, distanceFromHome);
        mealTicketsPayment = payment.getMealTickets(nextMonthShifts);
        mealTicketValue = payment.getMealTicketValue(baseMonthlySalaryPayment);
        overTimePayX = payment.getOverTimePayX(baseMonthlySalaryPayment, absMonthlyHours);
        overTimePay = payment.getOverTimePay(baseMonthlySalaryPayment, absMonthlyHours, extraHours);
        grossPay = payment.getGrossPay(baseMonthlySalaryPayment, nightWorkPayment, weekEndWorkPayment, specialVacationPayment, vacationPay, workCommutePayment, compensatoryAddTax, passiveHoursPayment, holidayPassiveHoursPayment, overTimePay);
        socialInsBaseEE = payment.getSocialInsBaseEE(grossPay, workCommutePayment);
        healthInsBaseEE = payment.getHealthInsBaseEE(grossPay, workCommutePayment);
        socialInsuranceEEX = payment.getSocialInsuranceEEX();
        socialInsuranceEE = payment.getSocialInsuranceEE(socialInsBaseEE);
        healthInsuranceEEX = payment.getHealthInsuranceEEX();
        healthInsuranceEE = payment.getHealthInsuranceEE(healthInsBaseEE);
        syndicateCost = payment.getSyndicateCost(baseMonthlySalaryPayment);
        optionalPensionEE = payment.getOptionalPensionEE(baseMonthlySalaryPayment);
        netTaxBase = payment.getNetTaxBase(grossPay, workCommutePayment, mealTicketsPayment, socialInsuranceEE, healthInsuranceEE, syndicateCost, optionalPensionEE);
        totalTaxX = payment.getTotalTaxX();
        totalTax = payment.getTotalTax(netTaxBase);
        netLegalPay = payment.getNetLegalPay(grossPay, socialInsuranceEE, healthInsuranceEE, totalTax);
        paymentAmount = payment.getPaymentAmount(netLegalPay, syndicateCost, optionalPensionEE);

        DecimalFormat df = new DecimalFormat("#.00");
        grossPayLabel.setText(df.format(grossPay));
        if (paymentAmount < 0) paymentAmount = 0.0;
        netPay.setText(df.format(paymentAmount));
    }

    @FXML
    private Label info1;

    @FXML
    private TextArea info2;

    @FXML
    private Label info3;

    public void getHelp() throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("help.fxml"));
            Scene help = new Scene(fxmlLoader.load(), 400, 440);
            Stage stageOne = new Stage();
            stageOne.setTitle("Informatii");
            stageOne.setScene(help);
            stageOne.setResizable(false);
            stageOne.show();
        } catch (Exception e) {
            errorLabel.setText("Can't load new window");
        }
    }

    public void payslip() throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("payslip.fxml"));
            Parent root = fxmlLoader.load();
            PayslipController payslip = fxmlLoader.getController();
            payslip.setLabelText(nameField.getText(), salaryField.getText(), baseMonthlySalaryPayment, compensatoryAddTax, monthlyHours, hours, holidayHours, weekEndHours,
                    nightHours, passiveHours, holidayXPayment, vacationHours, specialVacationPayment, specialVacationXPayment, mealTicketValue, mealTicketsPayment, nightWorkXPayment, nightWorkPayment,
                    optionalPensionER, overTimePayX, overTimePay, passiveHoursXPayment, passiveHoursPayment, privateHealthInsurancePayment,
                    vacationPayX, vacationPay, weekEndWorkXPayment, weekEndWorkPayment, workCommutePayment,
                    extraHours, grossPay, healthInsBaseEE, healthInsuranceEEX, healthInsuranceEE, holidayPassiveHoursXPayment,
                    holidayPassiveHoursPayment, holidayWorkPayment, holyPassiveHours, netLegalPay, netTaxBase, nextMonthShifts, nextMonthShifts,
                    optionalPensionEE, paymentAmount, socialInsBaseEE, socialInsuranceEEX, socialInsuranceEE,
                    syndicateCost, totalTaxX, totalTax, vacationDays, vacationPayDays, absMonthlyHours);

            Scene payslipScene = new Scene(root);
            Stage stageTwo = new Stage();
            stageTwo.setTitle("Fluturas Salariu");
            stageTwo.setScene(payslipScene);
            stageTwo.setResizable(false);
            stageTwo.show();
        } catch (Exception e) {
            errorLabel.setText("Can't load new window");
        }
    }
}
