package com.Harish;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT =100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principle: ");
        int principle = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualRate = scanner.nextFloat();
        float monthlyInterest = annualRate/MONTHS_IN_YEAR/PERCENT;

        System.out.println("Period (years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principle* (monthlyInterest* Math.pow(1+monthlyInterest, numberOfPayments))
                /(Math.pow(1+monthlyInterest, numberOfPayments)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);

    }
}
