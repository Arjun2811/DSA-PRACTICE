package Inheritance;

public class Car extends Vehicle{
int gears;
boolean isconvertible;

public Car(int maxspeed)
{
super(150);
this.maxspeed=maxspeed;


}
public void print()
{isconvertible=true;
    System.out.println("CAR CONSTRUCTOR "+"="+ maxspeed);
System.out.println("CAR CONSTRUCTOR"+"="+ isconvertible);
}

}
