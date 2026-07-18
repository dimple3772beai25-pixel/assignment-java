package day12;

class Employee {

    int id;
    String name;
    String department;
    double salary;

    Employee() {
        id = 0;
        name = "Not Assigned";
        department = "Not Assigned";
        salary = 0;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
        department = "Not Assigned";
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
        System.out.printf("Salary : Rs. %.2f\n\n", salary);
    }
}

public class practical1 {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Amit", 45000);
        Employee e3 = new Employee(101, "Neha", "IT", 60000);

        e1.display();
        e2.display();
        e3.display();
    }
}