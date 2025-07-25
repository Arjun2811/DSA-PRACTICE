package practice.Fraction;

public class FractionUse {



public static void main(String[]args) throws ZeroNumeratorException
{
    Fraction f1=new Fraction(5,10);
    f1.print();
    
f1.setnumerator(0);
    
  
    f1.print();
// Fraction f2= new Fraction(10,20);
// Fraction f3= new Fraction(20,50);
// f1.add(f2);
// f1.multiply(f3);
// Fraction f4=f1.add(f2,f3);
// f4.print();
}

}
