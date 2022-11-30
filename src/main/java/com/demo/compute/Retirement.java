package com.demo.compute;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
public class Retirement {

    private static Scanner scanner;
    private static int workingYears;
    private static int amtCanSave;
    private static double balance = 0;
    private static int year = 0;
    private static double INTEREST_RATE = 0.03;
    private static int SPENDS = 50000;
    private static int MAX_YRS = 40;


    @Bean
    public static void workingYearsLeft() {
        scanner = new Scanner(System.in);
        System.out.print("Enter the number of working years left in career::");
        workingYears = scanner.nextInt();
    }

    @Bean
    public static void computeLoop() {
        System.out.print("Enter the amount that can be saved per year::");
        amtCanSave = scanner.nextInt();

        while (year < workingYears) {
            balance = balance + amtCanSave;
            balance = balance * (1 + INTEREST_RATE);
            year = year + 1;
        }

        year = 0;

        while (year <= MAX_YRS & balance > 0) {
            System.out.println(year);
            System.out.println(balance);
            balance = balance - SPENDS;
            balance = balance * (1 + INTEREST_RATE);
            year = year + 1;
        }
    }

}
