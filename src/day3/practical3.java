package day3;
import java.util.Scanner;
public class practical3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double itemPrice;
        int quantity;
        double deliveryCharge;
        double discountPercentage;

        double subtotal;
        double discountAmount;
        double amountAfterDiscount;
        double finalAmount;

        System.out.print("Enter Item Price: ");
        itemPrice = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Delivery Charge: ");
        deliveryCharge = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        discountPercentage = sc.nextDouble();

        // Validation
        if (itemPrice < 0 || quantity <= 0 || deliveryCharge < 0
                || discountPercentage < 0 || discountPercentage > 100) {

            System.out.println("Invalid Input!");
        }
        else {

            subtotal = itemPrice * quantity;

            discountAmount = subtotal * discountPercentage / 100;

            amountAfterDiscount = subtotal - discountAmount;

            finalAmount = amountAfterDiscount + deliveryCharge;

            System.out.println("\n========== ORDER BILL ==========");
            System.out.printf("Subtotal             : Rs. %.2f\n", subtotal);
            System.out.printf("Discount             : Rs. %.2f\n", discountAmount);
            System.out.printf("Delivery Charge      : Rs. %.2f\n", deliveryCharge);
            System.out.printf("Final Payable Amount : Rs. %.2f\n", finalAmount);
        }

        sc.close();

	}

}
