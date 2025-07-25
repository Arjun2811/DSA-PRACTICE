package OBJECTSANDCLASSES;

public class Studentuse {




    public static void main(String[] args) {
        Student s1= new Student(1, "Arjun", 2);
        Student s2= new Student(2, "Sanya", 3);
        System.out.println(s1.rollno);
        System.out.println(s1.id);
        System.out.println(s1.getname());
        System.out.println(Student.getnumstudents());

        System.out.println("print statement");
     s1.print();
    

    }
}
