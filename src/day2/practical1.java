package day2;
import java.util.Scanner;
public class practical1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int sub1, sub2, sub3, sub4, sub5;
        int total;
        double percentage;
        boolean pass;

        System.out.println("Enter marks of Subject 1 (0-100): ");
        sub1 = sc.nextInt();

        System.out.println("Enter marks of Subject 2 (0-100): ");
        sub2 = sc.nextInt();

        System.out.println("Enter marks of Subject 3 (0-100): ");
        sub3 = sc.nextInt();

        System.out.println("Enter marks of Subject 4 (0-100): ");
        sub4 = sc.nextInt();

        System.out.println("Enter marks of Subject 5 (0-100): ");
        sub5 = sc.nextInt();

        // Validation
        if (sub1 < 0 || sub1 > 100 ||
            sub2 < 0 || sub2 > 100 ||
            sub3 < 0 || sub3 > 100 ||
            sub4 < 0 || sub4 > 100 ||
            sub5 < 0 || sub5 > 100) {

            System.out.println("Invalid Marks! Marks should be between 0 and 100.");
        }
        else {

            total = sub1 + sub2 + sub3 + sub4 + sub5;

            percentage = (total / 500.0) * 100;

            pass = percentage >= 40;

            System.out.println("\n===== SEMESTER RESULT =====");
            System.out.println("Total Marks : " + total + " / 500");
            System.out.printf("Percentage  : %.2f%%\n", percentage);

            if (pass) {
                System.out.println("Result      : PASS");
            } else {
                System.out.println("Result      : FAIL");
            }
        }

        sc.close();
	}

}
