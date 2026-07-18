package day1;
import java.util.Scanner;

public class practical1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Laboratory Name: ");
        String lab = sc.nextLine();

        System.out.println("\nJAVA LAB READINESS CHECK");
        System.out.println("Student Name: " + name);
        System.out.println("Laboratory: " + lab);
        System.out.println("Status: Java environment is ready.");
        System.out.println("Compile: javac practical1.java");
        System.out.println("Run: java practical1");

        sc.close();
		
	}

}
