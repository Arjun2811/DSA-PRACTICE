package InheritanceWithSuper;

public class VehicleUse {

    public static void main(String[]args)
    {
    Vehicle v = new Vehicle();
    v.setcolor("black");
    v.maxspeed=350;
    // v.print();


    Car c= new Car();
    c.maxspeed=150;
    c.numdoors=4;
    c.setcolor("blue");
    c.print();
    }
}
