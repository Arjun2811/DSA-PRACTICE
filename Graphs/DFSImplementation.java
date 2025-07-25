package Graphs;
import java.util.Scanner;
public class DFSImplementation {

public static void DFS(int[][]arr,int fv,boolean[]visited)
{
visited[fv]=true;
System.out.println(fv);

int i=0;
while(i<arr.length)
{
if(arr[fv][i]==1&&visited[i]==false)
{
    DFS(arr,i,visited);
}
i++;
}
}

public static void helper(int[][]arr)
{
    int i=0;
    boolean visited[]=new boolean[arr.length];
    while(i<visited.length)
    {
        if(visited[i]==false)
        {
            DFS(arr, i, visited);
        }
        i++;
    }


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
boolean visited[]=new boolean[v];
helper(arr);

}

}
