package day7;

import java.util.Scanner;

public class practical1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[7];
        int present = 0;
        int absent;
        double percentage;

        for (int i = 0; i < attendance.length; i++) {

            while (true) {

                System.out.print("Enter Attendance for Day " + (i + 1) + " (1=Present, 0=Absent): ");
                attendance[i] = sc.nextInt();

                if (attendance[i] == 0 || attendance[i] == 1) {
                    break;
                } else {
                    System.out.println("Invalid Input! Enter 0 or 1.");
                }
            }
        }

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 1) {
                present++;
            }
        }

        absent = 7 - present;
        percentage = (present * 100.0) / 7;

        System.out.println("\nWEEKLY ATTENDANCE");

        for (int i = 0; i < attendance.length; i++) {
            System.out.println("Day " + (i + 1) + " : " + (attendance[i] == 1 ? "Present" : "Absent"));
        }

        System.out.println("Present Days : " + present);
        System.out.println("Absent Days : " + absent);
        System.out.printf("Attendance : %.2f%%", percentage);

        sc.close();
    }
}