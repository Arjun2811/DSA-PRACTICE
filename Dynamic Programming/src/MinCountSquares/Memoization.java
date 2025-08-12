package MinCountSquares;

import java.util.Scanner;

public class Memoization{


public static int MinCount(int n,int[]storage)
{
    if(n==0)
    {
        return 0;
    }

    if(storage[n]!=-1)
    {
        return storage[n];
    }

int i=1;
int min=Integer.MAX_VALUE;
while(i*i<=n)
{


    int ans=MinCount(n-i*i,storage);
    if(ans<min)
    {
        min=ans;
    }
 
i++;
}
storage[n]=min+1;
return min+1;


}




public static void main(String[]args)
{Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int storage[]=new int[n+1];
    int i=0;
    while(i<n+1)
    {
      storage[i]=-1;
      i++;
    }
    int ans=MinCount(n,storage);
    System.out.println(ans);
}
}
