package day6;

import java.util.Scanner;

public class practical1 {

    public static double calculateCharge(double weight) {
        return 50 + (weight * 20);
    }

    public static double calculateCharge(double weight, double distance) {
        return 50 + (weight * 20) + (distance * 1.5);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int type;
        double weight, distance, charge;

        System.out.println("1. Local Delivery");
        System.out.println("2. Outstation Delivery");
        System.out.print("Enter Delivery Type: ");
        type = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        weight = sc.nextDouble();

        if (weight <= 0) {
            System.out.println("Invalid Weight!");
            return;
        }

        if (type == 1) {

            charge = calculateCharge(weight);

            System.out.println("\nCOURIER CHARGE");
            System.out.println("Delivery : Local");
            System.out.println("Weight : " + weight + " kg");
            System.out.printf("Charge : Rs. %.2f", charge);

        } else if (type == 2) {

            System.out.print("Enter Distance (km): ");
            distance = sc.nextDouble();

            if (distance <= 0) {
                System.out.println("Invalid Distance!");
                return;
            }

            charge = calculateCharge(weight, distance);

            System.out.println("\nCOURIER CHARGE");
            System.out.println("Delivery : Outstation");
            System.out.println("Weight : " + weight + " kg");
            System.out.println("Distance : " + distance + " km");
            System.out.printf("Charge : Rs. %.2f", charge);

        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}