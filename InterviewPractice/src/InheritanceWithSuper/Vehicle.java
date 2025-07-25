package InheritanceWithSuper;

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
    System.out.println("vehicle color: "+color);
    System.out.println("vehicle maxspeed : "+maxspeed);
}

}
