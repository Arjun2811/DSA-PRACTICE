package StairCase;

public class Staircase {

public static int staircase(int n)
{
if(n==0)
{
    return 1;
}
if(n<0)
{
    return 0;
}


    int a=staircase(n-1);
    int b=staircase(n-2);
    int c=staircase(n-3);
    return a+b+c;
}

    public static void main(String[]args)
    {
        int n=3;
       int ans= staircase(n);
       System.out.println(ans);
    }
}
