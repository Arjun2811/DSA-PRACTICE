package practice.Fraction;

public class Fraction {

private int numerator;
private int denominator;


public  Fraction(int numerator,int denominator)
{
if(numerator==0||denominator==0)
{
    return;
}

    this.numerator=numerator;
    this.denominator=denominator;
    simplify(numerator,denominator);
}
public void setnumerator(int numerator)throws ZeroNumeratorException
{if(numerator==0)
    {
        ZeroNumeratorException e = new ZeroNumeratorException();
        throw e;
    }
    this.numerator=numerator;
    simplify(numerator, this.denominator);
}
public void setdenominator(int denominator) throws ZeroDenominatorException
{
    if(denominator==0)
    {
        ZeroDenominatorException e =  new ZeroDenominatorException();
        throw e;
    }
    this.denominator=denominator;
    simplify(this.numerator, denominator);


}
public void simplify(int numerator,int denominator)
{
    int bestgcd=1;
int min=Math.min(numerator,denominator);
int gcd=2;
while(gcd<=min)
{
if(numerator%gcd==0&&denominator%gcd==0)
{
   bestgcd=gcd;
}
gcd++;
}
this.numerator=numerator/bestgcd;
this.denominator=denominator/bestgcd;
}
public void print()
{
    if(denominator==1)
    {
        System.out.println(numerator);
    }
    else{
        System.out.println(numerator+"/"+denominator);
    }
}
public void add(Fraction f2)
{
   this.numerator= (this.numerator*f2.denominator)+(this.denominator*f2.numerator);
   this.denominator=this.denominator*f2.denominator;
   simplify(this.numerator, this.denominator);
print();
}
public void multiply(Fraction f3)
{
    this.numerator=this.numerator*f3.numerator;
    this.denominator=this.denominator*f3.denominator;
    simplify(numerator, denominator);
    print();
}
public Fraction add(Fraction f2,Fraction f3)
{
    int newnumerator=f2.numerator*f3.denominator+f2.denominator*f3.numerator;
    int newdenominator=f2.denominator*f3.denominator;

    Fraction f4= new Fraction(newnumerator, newdenominator);
    return f4;

}





}
