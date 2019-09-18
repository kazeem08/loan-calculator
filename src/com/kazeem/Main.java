package com.kazeem;

public class Main {

    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal", 1000, 100_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest", 1, 30);
        byte years = (byte) Console.readNumber("Period (years)", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);

        var report = new MortgageReport(calculator);
        report.PrintMortgage();
        report.printPaymentSchedule();

    }

}
