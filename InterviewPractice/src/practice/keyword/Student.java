package practice.keyword;

public class Student {


    final int rollno;
    String name;
    private static int numstudents;

public static int getnumstudent()
{
    return numstudents;
}


    public Student(String name,int rollno)
    {
        this.rollno=rollno;
        this.name=name;
        numstudents++;
    }
public void print()
{
    System.out.println("name: "+ name);
}
}
