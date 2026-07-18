
package day14;

class Student {

    int rollNo;
    String name;
    int[] marks;
    double attendance;

    Student(int rollNo, String name, int[] marks, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    int getTotal() {

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return total;
    }

    double getAverage() {
        return getTotal() / 5.0;
    }

    String getResult() {

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) {
                return "FAIL";
            }
        }

        return "PASS";
    }

    String getAttendanceStatus() {

        if (attendance >= 75)
            return "Satisfactory";
        else
            return "Shortage";
    }

    void display() {

        System.out.println(rollNo + " " + name +
                " Total: " + getTotal() +
                " Average: " + getAverage() +
                " Result: " + getResult() +
                " Attendance: " + getAttendanceStatus());
    }
}

public class practical1 {

    public static void main(String[] args) {

        Student[] s = new Student[2];

        s[0] = new Student(101, "Dimple",
                new int[]{70,65,80,75,72},82);

        s[1] = new Student(102, "Neha",
                new int[]{45,38,52,40,35},68);

        System.out.println("CLASS REPORT");

        for(int i=0;i<s.length;i++) {
            s[i].display();
        }
    }
}