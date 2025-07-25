package InheritanceWithSuper;

public class Car extends Vehicle {

int gears;
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
{ super.setmaxspeed(150);
    super.print();
    System.out.println( "car maxspeed : "+ maxspeed +"Vehicle Maxspeed : "+super.getmaxspeed());
    // System.out.println("car gears : "+gears);
    // System.out.println("car maxspeed : "+maxspeed);
}

}
