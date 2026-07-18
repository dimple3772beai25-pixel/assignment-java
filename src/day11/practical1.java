package day11;

import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int marks;
    double attendance;

    void readData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        while (true) {
            System.out.print("Enter Marks: ");
            marks = sc.nextInt();

            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid Marks!");
            }
        }

        while (true) {
            System.out.print("Enter Attendance (%): ");
            attendance = sc.nextDouble();

            if (attendance >= 0 && attendance <= 100) {
                break;
            } else {
                System.out.println("Invalid Attendance!");
            }
        }
    }

    String calculateResult() {

        if (marks >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    void displayProfile() {

        System.out.println(rollNo + " - " + name + " - Marks: " + marks +
                " - Attendance: " + attendance + "% - " + calculateResult());
    }
}

public class practical1 {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Enter Details of Student 1");
        s1.readData();

        System.out.println("\nEnter Details of Student 2");
        s2.readData();

        System.out.println("\nEnter Details of Student 3");
        s3.readData();

        System.out.println("\nSTUDENT PROFILES");

        s1.displayProfile();
        s2.displayProfile();
        s3.displayProfile();
    }
}