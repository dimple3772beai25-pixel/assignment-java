package day14;

class Vehicle {

    String number;
    int type;
    int hours;

    Vehicle(String number,int type,int hours){

        this.number=number;
        this.type=type;
        this.hours=hours;
    }
}

class ParkingTicket{

    Vehicle vehicle;
    double fee;

    ParkingTicket(Vehicle vehicle){

        this.vehicle=vehicle;
        calculateFee();
    }

    void calculateFee(){

        if(vehicle.type==1){

            fee=10+(vehicle.hours-1)*5;

        }else{

            fee=20+(vehicle.hours-1)*10;
        }
    }

    void display(){

        String t;

        if(vehicle.type==1)
            t="Two-Wheeler";
        else
            t="Car";

        System.out.println(vehicle.number+" "+t+" "+vehicle.hours+" Hours Fee Rs."+fee);
    }
}

public class practical2 {

    public static void main(String[] args) {

        Vehicle v1=new Vehicle("CH01AB1234",1,3);
        Vehicle v2=new Vehicle("CH02CD5678",2,2);

        ParkingTicket t1=new ParkingTicket(v1);
        ParkingTicket t2=new ParkingTicket(v2);

        t1.display();
        t2.display();

        System.out.println("Total Revenue : Rs."+(t1.fee+t2.fee));
    }
}