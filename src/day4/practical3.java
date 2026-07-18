package day4;
import java.util.Scanner;
public class practical3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double balance;
        int choice;
        double amount;

        
        System.out.print("Enter Initial Balance (Rs.): ");
        balance = sc.nextDouble();

        
        if (balance < 0) {
            System.out.println("Invalid balance.");
            return;
        }

        
        do {
            System.out.println("\n====== DIGITAL WALLET ======");
            System.out.println("1. Add Money");
            System.out.println("2. Make Payment");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

           
            switch (choice) {

                case 1:
                    System.out.print("Enter amount to add: Rs. ");
                    amount = sc.nextDouble();

                    if (amount > 0) {
                        balance = balance + amount;
                        System.out.println("Money added successfully.");
                        System.out.println("Updated Balance: Rs. " + balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter payment amount: Rs. ");
                    amount = sc.nextDouble();

                    
                    if (amount <= 0) {
                        System.out.println("Invalid amount.");
                    } else if (amount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance = balance - amount;
                        System.out.println("Payment completed.");
                        System.out.println("Updated Balance: Rs. " + balance);
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: Rs. " + balance);
                    break;

                case 4:
                    System.out.println("Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();

	}

}
