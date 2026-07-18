package day12;

class Room {

    int roomNo;
    String roomType;
    double dailyRate;
    boolean available;

    Room(int roomNo, String roomType, double dailyRate) {

        this.roomNo = roomNo;
        this.roomType = roomType;
        this.dailyRate = dailyRate;
        available = true;
    }

    void bookRoom(int days) {

        if (available) {

            available = false;

            System.out.println("\nBOOKING DETAILS");
            System.out.println("Room : " + roomNo);
            System.out.println("Type : " + roomType);
            System.out.println("Days : " + days);
            System.out.printf("Total Amount : Rs. %.2f\n", dailyRate * days);
            System.out.println("Status : Booked");

        } else {

            System.out.println("Room Already Booked");
        }
    }
}

public class practical2 {

    public static void main(String[] args) {

        Room r1 = new Room(305, "Deluxe", 2500);
        Room r2 = new Room(201, "Standard", 1800);

        r1.bookRoom(3);
        r2.bookRoom(2);
    }
}