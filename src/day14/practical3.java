package day14;

class Learner{

    String id;
    String name;
    double courseFee;
    double paid;
    int[] attendance;

    Learner(String id,String name,double courseFee,double paid,int[] attendance){

        this.id=id;
        this.name=name;
        this.courseFee=courseFee;
        this.paid=paid;
        this.attendance=attendance;
    }

    double calculatePendingFee(){

        return courseFee-paid;
    }

    double calculateAttendancePercentage(){

        int present=0;

        for(int i=0;i<attendance.length;i++){

            if(attendance[i]==1)
                present++;
        }

        return (present*100.0)/attendance.length;
    }

    String isCertificateEligible(){

        if(calculatePendingFee()>0)
            return "Not Eligible (Fee Pending)";

        if(calculateAttendancePercentage()<75)
            return "Not Eligible (Attendance Shortage)";

        return "Eligible";
    }

    void display(){

        System.out.println("LEARNER REPORT");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.printf("Pending Fee : Rs. %.2f\n",calculatePendingFee());
        System.out.printf("Attendance : %.2f%%\n",calculateAttendancePercentage());
        System.out.println("Certificate Eligibility : "+isCertificateEligible());
    }
}

public class practical3 {

    public static void main(String[] args) {

        Learner l1=new Learner(
                "L101",
                "Dimple",
                15000,
                12000,
                new int[]{1,1,1,0,1,1,1});

        l1.display();
    }
}