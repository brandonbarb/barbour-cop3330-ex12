/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the principal: ");
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        double rate100 = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        double rate = rate100 / 100;
        double amount = principal * (1 + (rate * years));
        BigDecimal total = new BigDecimal(Double.toString(amount));
        total = total.setScale(2, RoundingMode.UP);
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.\n", years, rate100, total.doubleValue());
    }
}
