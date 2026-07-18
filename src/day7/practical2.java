package day7;

import java.util.Scanner;

public class practical2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        int pass = 0;
        int fail = 0;
        double average;

        for (int i = 0; i < marks.length; i++) {

            while (true) {

                System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                } else {
                    System.out.println("Invalid Marks!");
                }
            }
        }

        for (int i = 0; i < marks.length; i++) {

            total += marks[i];

            if (marks[i] >= 40) {
                pass++;
            } else {
                fail++;
            }
        }

        average = total / 5.0;

        System.out.println("\nMARKS DASHBOARD");

        System.out.print("Marks : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
        System.out.println("Total : " + total);
        System.out.printf("Average : %.2f\n", average);
        System.out.println("Passed Subjects : " + pass);
        System.out.println("Failed Subjects : " + fail);

        sc.close();
    }
}