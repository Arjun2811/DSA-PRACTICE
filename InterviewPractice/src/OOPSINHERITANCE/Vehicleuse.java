package OOPSINHERITANCE;

public class Vehicleuse {


public static void main(String[]args)
{
    Vehicle v1= new Vehicle();
    v1.color="red";
    v1.setmaxspeed(500);
    v1.print();
    Car c1= new Car();
    c1.gears=4;
    c1.color="blue";
    c1.setmaxspeed(250);
    c1.print();
}



}
