package Fibnaoici;
import java.util.Scanner;
public class Recursion {


public static int fib(int n)
{
if(n==0)
{
    return 0;
}
if(n==1)
{
    return 1;
}




    int ans=fib(n-1);
    int ans1=fib(n-2);
    return ans+ans1;
}


    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
       int ans= fib(n);
       System.out.println(ans);
    }
}
