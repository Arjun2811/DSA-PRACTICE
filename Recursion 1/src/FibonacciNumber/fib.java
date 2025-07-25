package FibonacciNumber;

public class fib {



public static int fib(int n)
{
    if(n==1||n==2)
    {
        return 1;
    }
    if(n==0)
    {
        return 0;
    }
    
    
    int ans1=fib(n-1);
    int ans2=fib(n-2);
    return ans1+ans2;
}


    public static void main(String[]args)
    {
        int n=4;
        int ans=fib(n);
        System.out.println(ans);
    }
}
