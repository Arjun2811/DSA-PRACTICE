package OBJECTSANDCLASSES;

public class Student {

final int rollno;
 private String name;
 int id;
private static int numstudents;

public Student(int rollno,String name,int id)
{

    this.rollno=rollno;
    this.id=id;
    this.name=name;
    numstudents++;
}



public static int getnumstudents()
{
    return numstudents;
}
public void setname(String name)
{
    this.name=name;
}
public String getname()
{
    return name;
}

public void print()
{
    System.out.println("name:"+name+"numstudents"+numstudents);
}


}



