package day6;

import java.util.Scanner;

public class practical2 {

    public static double area(double side) {
        return side * side;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(int radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.print("Enter Choice: ");
        choice = sc.nextInt();

        if (choice == 1) {

            double side;

            System.out.print("Enter Side: ");
            side = sc.nextDouble();

            System.out.println("\nAREA RESULT");
            System.out.println("Shape : Square");
            System.out.printf("Area : %.2f square units", area(side));

        } else if (choice == 2) {

            double length, width;

            System.out.print("Enter Length: ");
            length = sc.nextDouble();

            System.out.print("Enter Width: ");
            width = sc.nextDouble();

            System.out.println("\nAREA RESULT");
            System.out.println("Shape : Rectangle");
            System.out.printf("Area : %.2f square units", area(length, width));

        } else if (choice == 3) {

            int radius;

            System.out.print("Enter Radius: ");
            radius = sc.nextInt();

            System.out.println("\nAREA RESULT");
            System.out.println("Shape : Circle");
            System.out.printf("Area : %.2f square units", area(radius));

        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}