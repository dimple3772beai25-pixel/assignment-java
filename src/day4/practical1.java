package day4;
import java.util.Scanner;
public class practical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int vehicleType, hours, fee = 0;

        System.out.println("===== UNIVERSITY PARKING =====");
        System.out.println("1. Two-Wheeler");
        System.out.println("2. Car");

        System.out.print("Enter Vehicle Type: ");
        vehicleType = sc.nextInt();

        System.out.print("Enter Parking Hours: ");
        hours = sc.nextInt();

        if (hours < 1 || hours > 12) {
            System.out.println("Invalid Hours! Hours should be between 1 and 12.");
        } else {

            switch (vehicleType) {

                case 1:
                    fee = 10;
                    if (hours > 1) {
                        fee = fee + (hours - 1) * 5;
                    }

                    System.out.println("\n===== PARKING FEE =====");
                    System.out.println("Vehicle : Two-Wheeler");
                    System.out.println("Hours   : " + hours);
                    System.out.println("Fee     : Rs. " + fee);
                    break;

                case 2:
                    fee = 20;
                    if (hours > 1) {
                        fee = fee + (hours - 1) * 10;
                    }

                    System.out.println("\n===== PARKING FEE =====");
                    System.out.println("Vehicle : Car");
                    System.out.println("Hours   : " + hours);
                    System.out.println("Fee     : Rs. " + fee);
                    break;

                default:
                    System.out.println("Invalid Vehicle Type!");
            }
        }

        sc.close();
		
	}

}
