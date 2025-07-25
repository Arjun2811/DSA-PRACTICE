package OOPS;

public class Vehicle {

    String color;
    private int maxspeed;

public void setmaxspeed(int maxspeed)
{
    this.maxspeed=maxspeed;
}
public int getmaxspeed()
{
    return maxspeed;
}
public void print()
{
    System.out.println("maxspeed : "+maxspeed);
    System.out.println("color: "+color);
}
}