package day6;

import java.util.Scanner;

public class practical3 {

    public static double calculateBill(int units) {
        return units * 6;
    }

    public static double calculateBill(int units, double equipmentCharge) {
        return (units * 6) + equipmentCharge;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, units;
        double equipmentCharge, bill;

        System.out.println("1. Room");
        System.out.println("2. Laboratory");
        System.out.print("Enter Consumer Type: ");
        choice = sc.nextInt();

        System.out.print("Enter Units: ");
        units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid Units!");
            return;
        }

        if (choice == 1) {

            bill = calculateBill(units);

            System.out.println("\nELECTRICITY ESTIMATE");
            System.out.println("Type : Room");
            System.out.printf("Energy Charge : Rs. %.2f\n", bill);
            System.out.printf("Total Cost : Rs. %.2f", bill);

        } else if (choice == 2) {

            System.out.print("Enter Equipment Charge: ");
            equipmentCharge = sc.nextDouble();

            bill = calculateBill(units, equipmentCharge);

            System.out.println("\nELECTRICITY ESTIMATE");
            System.out.println("Type : Laboratory");
            System.out.printf("Energy Charge : Rs. %.2f\n", units * 6.0);
            System.out.printf("Equipment Charge : Rs. %.2f\n", equipmentCharge);
            System.out.printf("Total Cost : Rs. %.2f", bill);

        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
 