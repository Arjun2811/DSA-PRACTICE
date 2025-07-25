package practice.OOPSINHERITANCE;

public class VeicleUse {

public static void main(String[]args)
{


    Vehicle v1= new Vehicle();
    v1.setspeed(150);
    v1.color="blue";
    // v1.print();

    Car c1= new Car();
    c1.isconvertable=true;
    c1.setspeed(360);

    c1.color="red";
c1.printspeed();
    // c1.print();

}
}
