package FractionClass;

public class Fractionuse {



    public static void main(String[] args) {
        try{
        Fraction f1= new Fraction(10,6);
        }
        catch(Exception e)
        {
            System.out.println("dont set numerator as 0");

            Fraction f1= new Fraction(5,2);//unhandled again
            f1.print();
        }

        Fraction f2= new Fraction(5,2);//unhandled

        f1.add(f2) ;
        f1.print();
        Fraction f3=f1.multiply(f2);
        f3.print();

        System.out.println("Exception handling checking");
        try{
        f1.setnumerator(0);
        }
        catch(Exception e)
        {
            System.out.println("0 cannot be numerator");
        }
        f1.print();
        try{
        f1.setdenominator(0);
        }
        catch(ZerodenominatorException e)
        {
            System.out.println("0 cannot be the denominator");
        }
        f1.print();
    }
}
