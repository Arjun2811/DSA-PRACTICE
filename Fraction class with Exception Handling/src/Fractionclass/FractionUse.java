package Fractionclass;

public class FractionUse {

    public static void main(String[]args){

    Fraction f1=new Fraction(1,2);


System.out.println("the values are 0");


    f1.print();
    //1/2

    

try{
    f1.setnumerator(0);
}
catch(ZeroNumeratorException e)
{
    System.out.println("Dont set numerator as 0");
}
    int d=f1.getdenominator();
    System.out.println(d);
   // 1
    f1.print();
    //6
try{
    f1.setnumerator(0);
    f1.setdenominator(60);
}
catch(Exception e)
{
    System.out.println("dont set numerator  as 0");
}

    f1.print();
    //1/2
    Fraction f2= new Fraction(20,40);
    f1.add(f2);
    f1.print();
    //1
    f2.print();
    //1/2

    Fraction f3=new Fraction(2,6);
    f3.multiply(f2);
    f3.print();
    //1/6
    f2.print();
    //1/2
try{
    Fraction.add(f1,f2);
}
catch( Exception e){
    System.out.println("either of numerator or denomintor is 0");
} 
    //3/2
}
}
