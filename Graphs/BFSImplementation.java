package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSImplementation {



public static void BFS(int[][]arr,boolean visited[],int fv)
{

Queue<Integer>q1=new LinkedList<>();
q1.add(fv);
visited[fv]=true;
while(q1.size()!=0)
{
    int sv=q1.remove();
    System.out.println(sv);
    int i=0;
    while(i<arr.length)
    {
        if(arr[sv][i]==1&&visited[i]==false)
        {
            q1.add(i);
            visited[i]=true;
        }
        i++;
    }

}



}


public static void helper(int [][]arr)
{
    boolean visited[]=new boolean[arr.length];
    int i=0;
    while(i<arr.length)
    {
        if(visited[i]==false)
        {
            BFS(arr,visited,i);
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

helper(arr);

    }
}
