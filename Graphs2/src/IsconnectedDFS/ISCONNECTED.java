package IsconnectedDFS;
import java.util.Scanner;
public class ISCONNECTED {


public static void isconnected(int[][]arr,boolean[]visited,int fv)
{

visited[fv]=true;
int i=0;
while(i<arr.length)
{
    if(arr[fv][i]==1&&visited[i]==false)
    {
        isconnected(arr, visited, i);
    }
    i++;
}



}
public static boolean helper(int[][]arr)
{


    boolean visited[]=new boolean[arr.length];
        isconnected(arr,visited,0);
        int i=0;
        while(i<arr.length)
        {
if(visited[i]==false)
{
return false;
}
i++;
}
return true;
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
     
  System.out.println(helper(arr));
        }
    }

