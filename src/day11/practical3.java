package day11;

import java.util.Scanner;

class Book {

    String bookId;
    String title;
    String author;
    boolean issued = false;

    void readData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        bookId = sc.nextLine();

        System.out.print("Enter Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author: ");
        author = sc.nextLine();
    }

    void issueBook() {

        if (issued) {
            System.out.println("Book is already issued.");
        } else {
            issued = true;
            System.out.println("Book issued successfully.");
        }
    }

    void returnBook() {

        if (!issued) {
            System.out.println("Book is already available.");
        } else {
            issued = false;
            System.out.println("Book returned successfully.");
        }
    }

    void displayBook() {

        System.out.println("\nBOOK DETAILS");
        System.out.println("Book ID : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);

        if (issued) {
            System.out.println("Book Status : Issued");
        } else {
            System.out.println("Book Status : Available");
        }
    }
}

public class practical3 {

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book();

        System.out.println("Enter Book 1 Details");
        b1.readData();

        System.out.println();

        System.out.println("Enter Book 2 Details");
        b2.readData();

        b1.issueBook();
        b1.displayBook();

        b1.returnBook();
        b1.displayBook();

        b2.issueBook();
        b2.issueBook();

    }
}