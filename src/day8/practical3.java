package day8;

import java.util.Scanner;

public class practical3 {

    public static double[] addTax(double[] prices, double taxRate) {

        double[] gstPrices = new double[prices.length];

        for (int i = 0; i < prices.length; i++) {
            gstPrices[i] = prices[i] + (prices[i] * taxRate / 100);
        }

        return gstPrices;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Items: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input!");
            return;
        }

        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {

            while (true) {

                System.out.print("Enter Price " + (i + 1) + ": ");
                prices[i] = sc.nextDouble();

                if (prices[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid Price!");
                }
            }
        }

        System.out.print("Enter GST Percentage: ");
        double gst = sc.nextDouble();

        double[] gstPrices = addTax(prices, gst);

        System.out.println("\nORIGINAL PRICES:");
        for (int i = 0; i < prices.length; i++) {
            System.out.printf("%.2f ", prices[i]);
        }

        System.out.println("\nGST-ADJUSTED PRICES:");
        for (int i = 0; i < gstPrices.length; i++) {
            System.out.printf("%.2f ", gstPrices[i]);
        }

        sc.close();
    }
}