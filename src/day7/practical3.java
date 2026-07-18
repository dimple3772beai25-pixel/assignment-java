package day7;

import java.util.Scanner;

public class practical3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] expense = new double[7];
        double total = 0;
        double average;
        double budget;
        int count = 0;

        for (int i = 0; i < expense.length; i++) {

            while (true) {

                System.out.print("Enter Expense for Day " + (i + 1) + ": ");
                expense[i] = sc.nextDouble();

                if (expense[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid Expense!");
                }
            }
        }

        System.out.print("Enter Daily Budget Limit: ");
        budget = sc.nextDouble();

        for (int i = 0; i < expense.length; i++) {

            total += expense[i];

            if (expense[i] > budget) {
                count++;
            }
        }

        average = total / 7;

        System.out.println("\nEXPENSE REPORT");

        for (int i = 0; i < expense.length; i++) {
            System.out.println("Day " + (i + 1) + " : Rs. " + expense[i]);
        }

        System.out.printf("Total Spending : Rs. %.2f\n", total);
        System.out.printf("Average Daily Spending : Rs. %.2f\n", average);
        System.out.println("Days Above Budget : " + count);

        sc.close();
    }
}