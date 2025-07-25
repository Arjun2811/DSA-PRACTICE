package practice.keyword;

public class Studentuse {

public static void main(String[]args)
{
    Student s1= new Student("Arjun",1);
    System.out.println(s1.getnumstudent());
    Student s2= new Student("lovey",2);
    System.out.println(s2.getnumstudent());
    System.out.println(Student.getnumstudent());
    s1.print();

}


}
