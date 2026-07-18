package day12;

class Enrollment {

    String id;
    String learner;
    String course;
    double fee;
    String paymentStatus;

    Enrollment(String id, String learner, String course, double fee, String paymentStatus) {

        this.id = id;
        this.learner = learner;
        this.course = course;
        this.fee = fee;
        this.paymentStatus = paymentStatus;
    }

    Enrollment(String id, String learner, String course, double fee) {

        this(id, learner, course, fee, "Pending");
    }

    void display() {

        System.out.println("ENROLLMENT RECORD");
        System.out.println("ID : " + id);
        System.out.println("Learner : " + learner);
        System.out.println("Course : " + course);
        System.out.printf("Fee : Rs. %.2f\n", fee);
        System.out.println("Payment Status : " + paymentStatus);
        System.out.println();
    }
}

public class practical3 {

    public static void main(String[] args) {

        Enrollment e1 = new Enrollment("E101", "Aman", "Java Programming", 12000);
        Enrollment e2 = new Enrollment("E102", "Neha", "Python", 15000, "Paid");

        e1.display();
        e2.display();
    }
}