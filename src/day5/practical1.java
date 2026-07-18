package day5;

import java.util.Scanner;

public class practical1 {

    public static int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }

    public static double calculatePercentage(int total, int maxMarks) {
        return (total * 100.0) / maxMarks;
    }

    public static boolean isPassed(int m1, int m2, int m3, int m4, int m5) {

        if (m1 >= 33 && m2 >= 33 && m3 >= 33 && m4 >= 33 && m5 >= 33) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5;

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        m5 = sc.nextInt();

        
        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 ||
            m3 < 0 || m3 > 100 || m4 < 0 || m4 > 100 ||
            m5 < 0 || m5 > 100) {

            System.out.println("Invalid Marks!");
            return;
        }

        int total = calculateTotal(m1, m2, m3, m4, m5);
        double percentage = calculatePercentage(total, 500);
        boolean result = isPassed(m1, m2, m3, m4, m5);

        System.out.println("\n------ STUDENT RESULT ------");
        System.out.println("Total Marks : " + total);
        System.out.printf("Percentage : %.2f%%\n", percentage);

        if (result) {
            System.out.println("Status : PASS");
        } else {
            System.out.println("Status : FAIL");
        }

        sc.close();
    }
}