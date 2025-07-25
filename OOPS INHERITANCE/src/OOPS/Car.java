package OOPS;

public class Car extends Vehicle{

    int gears;
    boolean isconvertible;

    public void print()
    {
        System.out.println("gears :"+gears);
        System.out.println("isconvertible :"+ isconvertible);
        System.out.println("maxspeed : "+ getmaxspeed());
    }

}
