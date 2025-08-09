package Fibnaoici;
import java.util.Scanner;
public class Memoization {


public static int fib(int n,int storage[])
{
if(n==0)
{
    return 0;
}
if(n==1)
{
    return 1;
}


if(storage[n]!=-1)
{
    return storage[n];
}

    int ans=fib(n-1,storage);
    int ans1=fib(n-2,storage);
    storage[n]=ans+ans1;
    return ans+ans1;
}


    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
       
        int n=s.nextInt();
        int storage[]=new int[n+1];
        int i=0;
        while(i<n+1)
        {
            storage[i]=-1;
            i++;
        }
       int ans= fib(n,storage);
       System.out.println(ans);
    }
}
