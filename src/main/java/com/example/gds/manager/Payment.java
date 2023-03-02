package com.example.gds.manager;

public class Payment {
    public double getBaseMonthlySalary(double salary, int absMonthlyHours, int monthlyHours, int hours) {
        if (hours == 0) return 0.0;
        return salary * monthlyHours / absMonthlyHours;
    }

    public double getNightWork(double salary, int absMonthlyHours, int nightHours) {
        return 0.25 * 1.2 * salary / absMonthlyHours * nightHours;
    }

    public double getNightWorkX(double salary, int absMonthlyHours) {
        return 0.25 * 1.2 * salary / absMonthlyHours;
    }

    public double getWeekEndWork(double salary, int absMonthlyHours, int weekEndHours) {
        return 0.5 * 1.2 * salary / absMonthlyHours * weekEndHours;
    }

    public double getWeekEndWorkX(double salary, int absMonthlyHours) {
        return 0.5 * 1.2 * salary / absMonthlyHours;
    }

    public double getHolidayWork(double salary, int absMonthlyHours, int holyHours) {
        return 1 * 1.2 * salary / absMonthlyHours * holyHours;
    }

    public double getHolidayX(double salary, int absMonthlyHours) {
        return 1 * 1.2 * salary / absMonthlyHours;
    }

    public double getSpecialVacation(double salary, int absMonthlyHours, int vacationHours) {
        return 1 * 1.2 * salary / absMonthlyHours * vacationHours;
    }

    public double getSpecialVacationX(double salary, int absMonthlyHours) {
        return 1 * 1.2 * salary / absMonthlyHours;
    }

    public double getVacationPay(double vacationPayX, int vacationPayDays) {
        return vacationPayX * vacationPayDays;
    }

    public double getVacationPayX(double salary, int absMonthlyHours, int nightHours, int passiveHours, int holyPassiveHours, int absNumWorkDays) {
        double p = ((0.25 * 1.2 * salary / absMonthlyHours * nightHours) + (0.23 * 1.2 * salary / absMonthlyHours * passiveHours) + (0.28 * 1.2 * salary / absMonthlyHours * holyPassiveHours)) / salary;
        return ((salary * (1 + p)) / (absNumWorkDays));
    }

    public double getCompensatoryTaxAdd(double salary, int absMonthlyHours, int monthlyHours) {
        return 0.2 * salary * monthlyHours / absMonthlyHours;
    }

    public double getPassiveHours(double salary, int absMonthlyHours, int passiveHours) {
        return (0.23 * 1.2 * salary / absMonthlyHours * passiveHours);
    }

    public double getPassiveHoursX(double salary, int absMonthlyHours) {
        return (0.23 * 1.2 * salary / absMonthlyHours);
    }

    public double getHolyPassiveHours(double salary, int absMonthlyHours, int holyPassiveHours) {
        return (0.28 * 1.2 * salary / absMonthlyHours * holyPassiveHours);
    }

    public double getHolyPassiveHoursX(double salary, int absMonthlyHours) {
        return (0.28 * 1.2 * salary / absMonthlyHours);
    }

    public double getPrivateHealthInsurance(double salary) {
        return salary * 0.007507692;
    }

    public double getOptionalPensionER(double salary) {
        if (salary != 0.0) return 150.0;
        return 0.0;
    }

    public double getWorkCommute(int nextMonthShifts, int distanceToHome) {
        return nextMonthShifts * 2 * distanceToHome * 0.35;
    }

    public int getMealTickets(int nextMonthShifts) {
        return nextMonthShifts * 20;
    }

    public double getMealTicketValue(double salary) {
        if (salary != 0.0) return 20;
        return 0.0;
    }

    public double getOverTimePay(double salary, int absMonthlyHours, int overTime) {
        return 2 * 1.2 * salary / absMonthlyHours * overTime;
    }

    public double getOverTimePayX(double salary, int absMonthlyHours) {
        return 2 * 1.2 * salary / absMonthlyHours;
    }

    public double getGrossPay(double baseMonthlySalary, double nightWork, double weekEndWork, double specialVacation, double vacationPay,
                              double workCommute, double compensatoryTaxAdd, double passiveHours, double holidayPassiveHours, double overTimePay) {
        return baseMonthlySalary + nightWork + weekEndWork + specialVacation + 2 * vacationPay + workCommute + compensatoryTaxAdd + passiveHours + holidayPassiveHours + overTimePay;
    }

    public double getSocialInsBaseEE(double grossPay, double workCommute) {
        return grossPay - workCommute;
    }

    public double getHealthInsBaseEE(double grossPay, double workCommute) {
        return grossPay - workCommute;
    }

    public double getSocialInsuranceEE(double socialInsBaseEE) {
        return socialInsBaseEE * 0.25;
    }

    public double getSocialInsuranceEEX() {
        return 100 * 0.25;
    }

    public double getHealthInsuranceEE(double healthInsBaseEE) {
        return healthInsBaseEE * 0.10;
    }

    public double getHealthInsuranceEEX() {
        return 100 * 0.10;
    }

    public double getSyndicateCost(double salary) {
        return salary * 0.01;
    }

    public double getOptionalPensionEE(double salary) {
        if (salary != 0.0) return 45;
        return 0.0;
    }

    public double getNetTaxBase(double grossPay, double workCommute, double mealTickets, double socialInsuranceEE, double healthInsuranceEE, double syndicateCost, double optionalPensionEE) {
        return grossPay + mealTickets - workCommute - socialInsuranceEE - healthInsuranceEE - syndicateCost - optionalPensionEE;
    }

    public double getTotalTax(double netTaxBase) {
        return netTaxBase * 0.1;
    }

    public double getTotalTaxX() {
        return 100 * 0.1;
    }

    public double getNetLegalPay(double grossPay, double socialInsuranceEE, double healthInsuranceEE, double totalTax) {
        return grossPay - socialInsuranceEE - healthInsuranceEE - totalTax;
    }

    public double getPaymentAmount(double netLegalPay, double syndicateCost, double optionalPensionEE) {
        return netLegalPay - syndicateCost - optionalPensionEE;
    }
}
