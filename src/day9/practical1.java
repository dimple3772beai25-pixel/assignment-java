package day9;

import java.util.Scanner;

public class practical1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[5][3];

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter Marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {

                while (true) {

                    System.out.print("Assessment " + (j + 1) + ": ");
                    marks[i][j] = sc.nextInt();

                    if (marks[i][j] >= 0 && marks[i][j] <= 100) {
                        break;
                    } else {
                        System.out.println("Invalid Marks!");
                    }
                }
            }
        }

        System.out.println("\nINTERNAL ASSESSMENT SUMMARY");

        for (int i = 0; i < 5; i++) {

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double average = total / 3.0;

            System.out.printf("Student %d : Total %d, Average %.2f\n", i + 1, total, average);
        }

        sc.close();
    }
}