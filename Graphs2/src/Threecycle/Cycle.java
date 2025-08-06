package Threecycle;
import java.util.Scanner;
public class Cycle {





public static int Cycle(boolean[][]arr,int fv,boolean visited[],int originalfv,int n)
{
visited[fv]=true;

if(n==3)
{int ans=0;
    if(arr[fv][originalfv]==true)
    {
        System.out.println( fv+"  "+originalfv);
 ans=1;

    }
    visited[fv]=false;
    return ans;
}
int i=0;
int finalans=0;
while(i<arr.length)
{
    if(arr[fv][i]==true&&visited[i]==false)
    {
         int ans=Cycle(arr,i,visited,originalfv,n+1);
         finalans+=ans;
    }
    i++;
}
return finalans;
}



public static int helper(boolean[][]arr)
{
int i=0;
int count=0;
boolean visited[]=new boolean[arr.length];
while(i<arr.length)
{
    int j=i;
    while(j<arr.length)
    {
        
        visited[j]=false;
        j++;
    }
    visited[i]=true;
 count+=Cycle(arr,i,visited,i,1);
    i++;
}
return count;
}


    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        
        int v=s.nextInt();
        int e=s.nextInt();
        boolean arr[][]=new boolean[v][v];
        int i=0;
        while(i<e)
        {
            int fv=s.nextInt();
            int lv=s.nextInt();
        arr[fv][lv]=true;
        arr[lv][fv]=true;
        i++;
        }
        int count=helper(arr);
        System.out.println(count);

    }
}
