package Staircase;
import java.util.Scanner;
public class DP {


    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int storage[]=new int[n+1];
storage[0]=1;
        int i=1;
        while(i<n+1)
        {
            int b=0;
            int c=0;
int a=storage[i-1];
if(i>=2)
{
    b =storage[i-2];
}
if(i>=3)
{
    c=storage[i-3];
}
storage[i]=a+b+c;
i++;
        }
        System.out.println(storage[n]);

    }
}
