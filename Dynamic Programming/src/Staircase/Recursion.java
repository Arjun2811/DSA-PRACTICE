package Staircase;
import java.util.Scanner;
public class Recursion {






public static int Staircase(int n)
{if(n==0)
    {
        return 1;
    }





int b=0;
int c=0;
    int a=Staircase(n-1);
    if(n>=2)
    {
   b=Staircase(n-2);
    }
    if(n>=3)
    {
     c=Staircase(n-3);
    }
     return a+b+c;
    

}









    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
       int ans= Staircase(n);
       System.out.println(ans);

    }
}
