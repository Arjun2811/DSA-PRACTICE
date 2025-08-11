package Staircase;

import java.util.Scanner;

public class Memoziation {




public static int Staircase(int n,int[]storage)
{
    if(n==0)
    {
        return 1;
    }




    if(storage[n]!=-1)
    {
        return storage[n];
    }
int b=0;
int c=0;
    int a=Staircase(n-1,storage);
    if(n>=2)
    {
   b=Staircase(n-2,storage);
    }
    if(n>=3)
    {
     c=Staircase(n-3,storage);
    }
    storage[n]=a+b+c;
     return a+b+c;
}

    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int []storage=new int[n+1];
        int i=0;
        while(i<storage.length)
        {
            storage[i]=-1;
            i++;
        }
       int ans= Staircase(n,storage);
       System.out.println(ans);

    }
}







