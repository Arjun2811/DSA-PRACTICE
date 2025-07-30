package Islands;
import java.util.Scanner;
public class Island {







    public static void Island(int[][]arr,int fv,boolean visited[])
    {

visited[fv]=true;
int i=0;
while(i<arr.length)
{
    if(arr[fv][i]!=0&&visited[i]==false)
    {
        Island(arr,i,visited);
    }
    i++;
}



    }



public static int helper(int[][]arr)
{
    int v=arr.length;
boolean visited[]=new boolean[v];
int i=0;
int count=0;
while(i<v)
{
    if(visited[i]==false)
    {
        Island(arr,i,visited);
        count++;
    }
    i++;
}
return count;

}


public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    int v=s.nextInt();
    int e=s.nextInt();
    int arr[][]=new int[v][v];
    int i=0;
    while(i<e)
    {
        int fv=s.nextInt();
        int lv=s.nextInt();
        arr[fv][lv]=1;
        arr[lv][fv]=1;
        i++;
    }
    int ans=helper(arr);
    System.out.println(ans);

}

}
