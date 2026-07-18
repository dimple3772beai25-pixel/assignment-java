package day11;

import java.util.Scanner;

class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    void readData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Holder Name: ");
        holderName = sc.nextLine();

        System.out.print("Enter Opening Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
        }
    }

    void displayAccount() {

        System.out.println("\nACCOUNT SUMMARY");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder : " + holderName);
        System.out.printf("Final Balance : Rs. %.2f\n", balance);
    }
}

public class practical2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();

        System.out.println("Enter Details of Account 1");
        a1.readData();

        System.out.print("Deposit Amount: ");
        a1.deposit(sc.nextDouble());

        System.out.print("Withdrawal Amount: ");
        a1.withdraw(sc.nextDouble());

        System.out.println();

        System.out.println("Enter Details of Account 2");
        a2.readData();

        System.out.print("Deposit Amount: ");
        a2.deposit(sc.nextDouble());

        System.out.print("Withdrawal Amount: ");
        a2.withdraw(sc.nextDouble());

        a1.displayAccount();
        a2.displayAccount();

        sc.close();
    }
}