package com.example.gds;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.text.DecimalFormat;

public class PayslipController {
    @FXML
    private Label baseMonthlySalary;

    @FXML
    private Label compensatoryAddTax;

    @FXML
    private Label holidayX;

    @FXML
    private Label mealTicketValue;

    @FXML
    private Label mealTickets;

    @FXML
    private Label nightWorkX;

    @FXML
    private Label nightWork;

    @FXML
    private Label optionalPensionER;

    @FXML
    private Label overTimePayX;

    @FXML
    private Label overTimePay;

    @FXML
    private Label passiveHoursX;

    @FXML
    private Label passiveHours;

    @FXML
    private Label privateHealthInsurance;

    @FXML
    private Label vacationPayX;

    @FXML
    private Label vacation;

    @FXML
    private Label vacationPay;

    @FXML
    private Label vacationX;

    @FXML
    private Label weekEndWorkX;

    @FXML
    private Label weekEndWork;

    @FXML
    private Label workCommute;

    @FXML
    private Label extraHourS;

    @FXML
    private Label grossPay;

    @FXML
    private Label healthInsBaseEE;

    @FXML
    private Label healthInsuranceEEX;

    @FXML
    private Label healthInsuranceEE;

    @FXML
    private Label holidayPassiveHoursX;

    @FXML
    private Label holidayPassiveHours;

    @FXML
    private Label holidayHours;

    @FXML
    private Label holidayWork;

    @FXML
    private Label holyPassiveHours;

    @FXML
    private Label hourS;

    @FXML
    private Label netLegalPay;

    @FXML
    private Label netTaxBase;

    @FXML
    private Label nextMonthShifts;

    @FXML
    private Label nightHours;

    @FXML
    private Label optionalPensionEE;

    @FXML
    private Label passiveHoursLabel;

    @FXML
    private Label paymentAmount;

    @FXML
    private Label socialInsBaseEE;

    @FXML
    private Label socialInsuranceEEX;

    @FXML
    private Label socialInsuranceEE;

    @FXML
    private Label syndicateCost;

    @FXML
    private Label totalTaxX;

    @FXML
    private Label totalTax;

    @FXML
    private Label vacationHours;

    @FXML
    private Label vacationPayDays;

    @FXML
    private Label weekEndHours;

    @FXML
    private Label baseSalaryPayslip;

    @FXML
    private Label nameFieldPayslip;

    @FXML
    private Label monthHours;

    @FXML
    private Label nxtMonthShifts;

    @FXML
    private Label absWorkingHours;

    @FXML
    private Label vacationHourSLabel;

    @FXML
    private Label specialVacation;

    @FXML
    private Label specialVacationX;

    public void setLabelText(String name, String salary, double baseMonthlySalary, double compensatoryTaxAdd, int monthlyHours, int hours, int holidayHours, int weekEndHours,
                             int nightHours, int passiveHours, double holidayX, int vacationHoursPay, double specialVacation, double specialVacationX, double mealTicketValue, double mealTickets, double nightWorkX, double nightWork,
                             double optionalPensionER, double overTimePayX, double overTimePay, double passiveHoursX, double passiveHoursPay, double privateHealthInsurance,
                             double vacationPayX, double vacationPay, double weekEndWorkX, double weekEndWork, double workCommute,
                             int extraHours, double grossPay, double healthInsBaseEE, double healthInsuranceEEX, double healthInsuranceEE, double holidayPassiveHoursX,
                             double holidayPassiveHours, double holidayWork, int holyPassiveHours, double netLegalPay, double netTaxBase, int nextMonthShiftsNo,
                             int nextMonthShifts, double optionalPensionEE, double paymentAmount, double socialInsBaseEE, double socialInsuranceEEX, double socialInsuranceEE,
                             double syndicateCost, double totalTaxX, double totalTax, int vacationHours, int vacationPayDays, int absWorkingHours) {
        DecimalFormat df = new DecimalFormat("#.00");
        nameFieldPayslip.setText("" + name);
        baseSalaryPayslip.setText("" + salary);
        this.baseMonthlySalary.setText(df.format(baseMonthlySalary));
        compensatoryAddTax.setText(df.format(compensatoryTaxAdd));
        if (hours > monthlyHours) {
            hours = monthlyHours;
        }
        hourS.setText("" + hours);
        monthHours.setText("" + hours);
        this.holidayHours.setText("" + holidayHours);
        this.weekEndHours.setText("" + weekEndHours);
        this.nightHours.setText("" + nightHours);
        passiveHoursLabel.setText("" + passiveHours);
        this.holidayX.setText(df.format(holidayX));
        this.mealTicketValue.setText(df.format(mealTicketValue));
        this.mealTickets.setText(df.format(mealTickets));
        this.nightWorkX.setText(df.format(nightWorkX));
        this.nightWork.setText(df.format(nightWork));
        this.optionalPensionER.setText(df.format(optionalPensionER));
        this.overTimePayX.setText(df.format(overTimePayX));
        this.overTimePay.setText(df.format(overTimePay));
        this.passiveHoursX.setText(df.format(passiveHoursX));
        this.passiveHours.setText(df.format(passiveHoursPay));
        this.privateHealthInsurance.setText(df.format(privateHealthInsurance));
        vacationHourSLabel.setText("" + vacationHoursPay);
        this.specialVacation.setText(df.format(specialVacation));
        this.specialVacationX.setText(df.format(specialVacationX));
        this.vacationPayX.setText(df.format(vacationPayX));
        vacation.setText(df.format(vacationPay));
        this.vacationPay.setText(df.format(vacationPay));
        vacationX.setText(df.format(vacationPayX));
        this.weekEndWorkX.setText(df.format(weekEndWorkX));
        this.weekEndWork.setText(df.format(weekEndWork));
        this.workCommute.setText(df.format(workCommute));
        extraHourS.setText("" + extraHours);
        this.grossPay.setText(df.format(grossPay));
        this.healthInsBaseEE.setText(df.format(healthInsBaseEE));
        this.healthInsuranceEEX.setText(df.format(healthInsuranceEEX));
        this.healthInsuranceEE.setText(df.format(healthInsuranceEE));
        this.holidayPassiveHoursX.setText(df.format(holidayPassiveHoursX));
        this.holidayPassiveHours.setText(df.format(holidayPassiveHours));
        this.holidayWork.setText(df.format(holidayWork));
        this.holyPassiveHours.setText("" + holyPassiveHours);
        this.netLegalPay.setText(df.format(netLegalPay));
        this.netTaxBase.setText(df.format(netTaxBase));
        nxtMonthShifts.setText("" + nextMonthShifts);
        this.nextMonthShifts.setText("" + nextMonthShiftsNo);
        this.optionalPensionEE.setText(df.format(optionalPensionEE));
        this.paymentAmount.setText(df.format(paymentAmount));
        this.socialInsBaseEE.setText(df.format(socialInsBaseEE));
        this.socialInsuranceEEX.setText(df.format(socialInsuranceEEX));
        this.socialInsuranceEE.setText(df.format(socialInsuranceEE));
        this.syndicateCost.setText(df.format(syndicateCost));
        this.totalTaxX.setText(df.format(totalTaxX));
        this.totalTax.setText(df.format(totalTax));
        this.vacationHours.setText("" + vacationHours);
        this.vacationPayDays.setText("" + vacationPayDays);
        this.absWorkingHours.setText("" + absWorkingHours);
    }
}
