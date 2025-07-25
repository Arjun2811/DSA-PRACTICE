package Inheritance;

public class Vehicle {
int maxspeed;
int numdoors;

public Vehicle(int maxspeed)
{
    this.maxspeed=maxspeed;
 

}
// public Vehicle()
// {
//     System.out.println("hello im a default vehicle constructor");
// }
public void print()
{
    System.out.println("Vehicle Constructor");

    System.out.println("Vehicle constructor ="+maxspeed);
    System.out.println("Vehicle constructor ="+numdoors);
}

}
