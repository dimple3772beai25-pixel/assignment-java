package day9;

import java.util.Scanner;

public class practical2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] units = new int[4][7];

        for (int i = 0; i < 4; i++) {

            System.out.println("Enter Units for Room " + (i + 1));

            for (int j = 0; j < 7; j++) {

                while (true) {

                    System.out.print("Day " + (j + 1) + ": ");
                    units[i][j] = sc.nextInt();

                    if (units[i][j] >= 0) {
                        break;
                    } else {
                        System.out.println("Invalid Units!");
                    }
                }
            }
        }

        int hostelTotal = 0;

        System.out.println("\nHOSTEL ELECTRICITY REPORT");

        for (int i = 0; i < 4; i++) {

            int roomTotal = 0;

            for (int j = 0; j < 7; j++) {
                roomTotal += units[i][j];
            }

            hostelTotal += roomTotal;

            System.out.println("Room " + (i + 1) + " Weekly Units : " + roomTotal);
        }

        System.out.println("Total Hostel Consumption : " + hostelTotal + " units");

        sc.close();
    }
}