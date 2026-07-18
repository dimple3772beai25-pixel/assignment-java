package day3;
import java.util.Scanner;
public class practical1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Programme: ");
        String programme = sc.nextLine();

        System.out.print("Enter Semester: ");
        int semester = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        
        if (rollNo <= 0 || semester <= 0) {
            System.out.println("Invalid Roll Number or Semester.");
        } else {

            

            System.out.println("\n========== ADMISSION PROFILE ==========");
            System.out.println("Name        : " + name);
            System.out.println("Roll Number : " + rollNo);
            System.out.println("Programme   : " + programme);
            System.out.println("Semester    : " + semester);
            System.out.println("Email       : " + email);
            System.out.println("City        : " + city);
        }

        sc.close();
	}

}
