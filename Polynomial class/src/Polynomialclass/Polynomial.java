package Polynomialclass;

public class Polynomial {


    int degree[]= new int[200];

    public void setcoffiecient(int degree,int coeff)
    {
        this.degree[degree]=coeff;
    }
    public void print()
    {
        int i=0;
        while(i<200)
        {
            if(this.degree[i]!=0)
            {
                System.out.print(degree[i]+"x"+""+i+" ");
            }
            i++;
        }
    }
    public Polynomial add(Polynomial p1)
    {
        int i=0;
        while(i<200)
        {
            this.degree[i]=this.degree[i]+p1.degree[i];
            i++;
        }
return this;
    }
    public Polynomial subtract(Polynomial p1)
    {
        int i=0;
        while(i<200)
        {
            this.degree[i]=this.degree[i]-p1.degree[i];
            i++;
        }
        return this;
    }
    public Polynomial multiply(Polynomial p1)
    {Polynomial p3= new Polynomial();
        int i=0;
     while(i<200)
    {
     if(this.degree[i]!=0)
        {
    int j=0;
    while(j<200)
    {
        if(p1.degree[j]!=0)
        {
 p3.degree[i+j]=this.degree[i]*p1.degree[j];
        }
j++;

    }
}
    i++;

        
    }
return p3;
}

    }

