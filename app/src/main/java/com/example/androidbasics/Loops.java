package com.example.androidbasics;

public class Loops {
    public static void main(String[] args){
        // for loop
        for (int x = 1; x <= 24; x++) {
            if (24 % x == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println("\n");

        // while loop
        int y = 1;
        while (y <= 39) {
            if (39 % y == 0) {
                System.out.print(y + " ");
            }
            y++;
        }
        System.out.println("\n");

        // do while loop
        int z = 1;
        do {
            if (142 % z == 0) {
                System.out.print(z + " ");
            }
            z++;
        } while (z <= 142);
    }

}
