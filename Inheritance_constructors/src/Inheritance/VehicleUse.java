package Inheritance;

public class VehicleUse {

    public static void main(String[]args)
    {
        // Vehicle v1= new Vehicle(1000);
        // v1.numdoors=6;
        // v1.print();

        // Car c1 = new Car(120);
        // c1.print();
        Vehicle v1 = new Vehicle(300);
        v1.print();


        Vehicle v2= new Car(600);
        v2.maxspeed=350;
        
        v2.print();
    }
}
