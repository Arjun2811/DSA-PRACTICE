package InheritanceWithSuper;

public class Car extends Vehicle{

    public int numdoors;
    public int gears;
    public int maxspeed;

    public void print()
    {super.maxspeed=80;
        super.setcolor("red");
        super.print();
        System.out.println("CAR CLASS NUMDOORS = "+numdoors);
        System.out.println("CAR CLASS GEARS = "+gears);
        System.out.println("CAR CLASS MAXSPEED = "+maxspeed+"vehicle maxspeed ="+super.maxspeed);
    }


}
