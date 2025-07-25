package FractionClass;

public class Fraction {

private int numerator;
private int denominator;

public Fraction(int numerator,int denominator) throws Exception
{

    if(denominator==0||numerator==0)
    {
        Exception e= new Exception();
        throw e;
    }
    this.numerator=numerator;
    this.denominator=denominator;

    simplify(numerator,denominator);
}
public void simplify(int numerator,int denominator)
{
int lastcheck=Math.min(numerator,denominator);
int i=2;
int gcd=1;
while(i<=lastcheck)
{
if(numerator%i==0&&denominator%i==0)
{
gcd=i;
}
i++;
}
this.numerator=numerator/gcd;
this.denominator=denominator/gcd;
}
public void print()
{
    if(denominator==1)
    {
        System.out.println(numerator);
        return;
    }
System.out.println(numerator+"/"+denominator);

}





public void setnumerator(int numerator) throws ZeroNumeratorException
{

if(numerator==0)
{
    ZeroNumeratorException e= new ZeroNumeratorException();
    throw e;
}

this.numerator=numerator;
}
public void setdenominator(int denominator) throws ZerodenominatorException
{
    if(denominator==0)
    {
        ZerodenominatorException e= new ZerodenominatorException();
        throw e;
    }
this.denominator=denominator;
}
public int getnumerator()
{

    return numerator;
}

public int getdenominator()
{

    return denominator;
}
public void add(Fraction f2)
{

    this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
    this.denominator=this.denominator*f2.denominator;
    simplify(this.numerator, this.denominator);
}
public Fraction multiply(Fraction f2)
{
    int newnumerator=this.numerator*f2.numerator;
    int newdenominator=this.denominator*f2.denominator;

    Fraction f3= new Fraction(newnumerator,newdenominator);
    
    return f3;
}


}



