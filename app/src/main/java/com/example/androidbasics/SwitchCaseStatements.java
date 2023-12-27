package com.example.androidbasics;

import java.util.Scanner;

public class SwitchCaseStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter from 1 to 7 which representing the day of the week: ");
        int day = sc.nextInt();

        switch(day) {
            case 1 :
                System.out.println("Day of the week: Monday");
                break;
            case 2 :
                System.out.println("Day of the week: Tuesday");
                break;
            case 3 :
                System.out.println("Day of the week: Wednesday");
                break;
            case 4 :
                System.out.println("Day of the week: Thursday");
                break;
            case 5 :
                System.out.println("Day of the week: Friday");
                break;
            case 6 :
                System.out.println("Day of the week: Saturday");
                break;
            case 7 :
                System.out.println("Day of the week: Sunday");
                break;
            default :
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                break;
        }
        sc.close();
    }
}
