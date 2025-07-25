package Inheritance;

public class Vehicle {

String color;
int numdoors;

// public Vehicle()
// {
//     System.out.println("default vehicle constructor");
// }


public Vehicle(String color,int numdoors)
{System.out.println("parameterized vehicle constructor");
    this.color=color;
    this.numdoors=numdoors;
}


}
