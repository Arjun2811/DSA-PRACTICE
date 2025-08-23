package Practice;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Isconnected {



public static void IsConnected(int[][]arr,boolean[]visited,int fv)
{

Queue<Integer>q1=new LinkedList<>();
q1.add(fv);
visited[fv]=true;
while(q1.size()!=0)
{

int v=q1.remove();
int i=0;
while(i<arr.length)
{
    if(arr[v][i]==1&&visited[i]==false)
    {
q1.add(i);
visited[i]=true;
    }
    i++;
}


}










}

    public static boolean helper(int[][]arr)
    {
boolean visited[]=new boolean[arr.length];
        int v=arr.length;
        int i=0;
       
        
            IsConnected(arr,visited,i);
            int f=0;
            while(f<arr.length)
            {
                if(visited[f]==false)
                {
                    return false;
                }
                f++;
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
       boolean ans= helper(arr);
       System.out.println(ans);
    }
}
