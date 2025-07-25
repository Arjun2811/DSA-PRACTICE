package practice.OOPSINHERITANCE;

public class Vehicle {


String color;
private int speed;


public void setspeed(int speed)
{
    this.speed=speed;
}
public int getspeed()
{
    return speed;
}

public void print()
{
    System.out.println(" Vehicle color "+ color+" Vehicle speed "+speed);
}
}
