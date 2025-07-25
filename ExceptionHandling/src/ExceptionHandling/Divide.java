package ExceptionHandling;

public class Divide {

private int numerator;
private int denominator;


public void setnumerator(int numerator) throws ZeronumeratorException
{
    if(numerator==0)
    {
        ZeronumeratorException e= new ZeronumeratorException();
        throw e;
    }
    this.numerator=numerator;
}
public int getnumerator()
{
    return numerator;
}

public void setdenominator(int denominator) throws ZeroDenominatorException
{if(denominator==0)
    {throw  new ZeroDenominatorException();
    
    }

    this.denominator=denominator;
}


public int getdenominator()
{
return denominator;
}
}
