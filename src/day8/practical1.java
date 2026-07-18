package day8;

import java.util.Scanner;

public class practical1 {

    public static void readAttendance(double[] values) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < values.length; i++) {

            while (true) {

                System.out.print("Enter Attendance of Student " + (i + 1) + ": ");
                values[i] = sc.nextDouble();

                if (values[i] >= 0 && values[i] <= 100) {
                    break;
                } else {
                    System.out.println("Invalid Attendance!");
                }
            }
        }
    }

    public static double calculateAverage(double[] values) {

        double total = 0;

        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }

        return total / values.length;
    }

    public static int countShortage(double[] values, double limit) {

        int count = 0;

        for (int i = 0; i < values.length; i++) {

            if (values[i] < limit) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input!");
            return;
        }

        double[] attendance = new double[n];

        readAttendance(attendance);

        double average = calculateAverage(attendance);
        int shortage = countShortage(attendance, 75);

        System.out.println("\nCLASS ATTENDANCE");
        System.out.printf("Class Average: %.2f%%\n", average);
        System.out.println("Students Below 75%: " + shortage);

        sc.close();
    }
}