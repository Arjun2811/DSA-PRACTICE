package InheritanceWithSuper;

public class Vehicle {

    private String color;
    public int maxspeed;

    public void setcolor(String color)
    {
        this.color=color;
    }
    public String getcolor()
    {
        return color;
    }
    public void print()
    {
        System.out.println("VEHICLE CLASS MAXSPEED"+"="+maxspeed);
        System.out.println("VEHICLE CLASS COLOR"+"="+color);
    }

}
