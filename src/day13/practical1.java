package day13;

class Product {

    String productId;
    String name;
    double price;
    int quantity;

    Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalValue() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("PRODUCT BILL");
        System.out.println("Product ID : " + productId);
        System.out.println("Name : " + name);
        System.out.printf("Price : Rs. %.2f\n", price);
        System.out.println("Quantity : " + quantity);
        System.out.printf("Total Value : Rs. %.2f\n", calculateTotalValue());
    }
}

public class practical1 {

    public static void main(String[] args) {

        Product p1 = new Product("P101", "Keyboard", 850, 3);
        Product p2 = new Product("P102", "Mouse", 500, 2);

        p1.displayProduct();
        System.out.println();
        p2.displayProduct();
    }
}