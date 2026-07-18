package day8;

import java.util.Scanner;

public class practical2 {

    public static void readSales(double[] sales) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < sales.length; i++) {

            while (true) {

                System.out.print("Enter Sales of Month " + (i + 1) + ": ");
                sales[i] = sc.nextDouble();

                if (sales[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid Sales!");
                }
            }
        }
    }

    public static double calculateTotal(double[] sales) {

        double total = 0;

        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }

        return total;
    }

    public static double calculateAverage(double[] sales) {
        return calculateTotal(sales) / sales.length;
    }

    public static int countTargetMonths(double[] sales, double target) {

        int count = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] sales = new double[12];

        readSales(sales);

        System.out.print("Enter Target Sales: ");
        double target = sc.nextDouble();

        double total = calculateTotal(sales);
        double average = calculateAverage(sales);
        int months = countTargetMonths(sales, target);

        System.out.println("\nSALES PERFORMANCE");
        System.out.printf("Annual Sales: Rs. %.2f\n", total);
        System.out.printf("Average Monthly Sales: Rs. %.2f\n", average);
        System.out.println("Months Achieving Target: " + months);

        sc.close();
    }
}