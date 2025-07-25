package OOPS;

public class Vehicleuse {

public static void main(String[]args)
{
    Vehicle v1= new Vehicle();
    v1.color="black";
    v1.setmaxspeed(100);
    v1.print();
    Car c1= new Car();
    c1.gears=5;
    c1.isconvertible=true;
    c1.setmaxspeed(240);
    c1.print();

}

}
