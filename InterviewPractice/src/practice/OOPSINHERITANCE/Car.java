package practice.OOPSINHERITANCE;

public class Car extends Vehicle {


    boolean isconvertable;
    int id;

    public void print()
    {  super.print();
        System.out.println(" car isconvertable "+ isconvertable+ " car speed "+ getspeed());
    }
public void printspeed()
{
    super.setspeed(450);
    System.out.println(" car speed for vehicle class : " + super.getspeed()+" car speed : "+getspeed());
}
}
