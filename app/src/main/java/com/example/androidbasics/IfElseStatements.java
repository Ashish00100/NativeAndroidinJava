package com.example.androidbasics;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter from 1 to 7 which representing the day of the week: ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 7) {
            if (day == 1) {
                System.out.println("Day of the week: Sunday");
            } else if (day == 2) {
                System.out.println("Day of the week: Monday");
            } else if (day == 3) {
                System.out.println("Day of the week: Tuesday");
            } else if (day == 4) {
                System.out.println("Day of the week: Wednesday");
            } else if (day == 5) {
                System.out.println("Day of the week: Thursday");
            } else if (day == 6) {
                System.out.println("Day of the week: Friday");
            } else {
                System.out.println("Day of the week: Saturday");
            }
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        sc.close();
    }
}
