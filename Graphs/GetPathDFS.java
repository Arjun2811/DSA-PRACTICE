package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {



public static ArrayList<Integer> getpath(int [][]arr,int fv,int lv, boolean visited [])
{

if(fv==lv)
{
  ArrayList<Integer>path=new ArrayList<>();
  path.add(fv);
    return path;
}

visited[fv]=true;
    int i=0;
    while(i<arr.length)
    {
        if(arr[fv][i]==1&&visited[i]==false)
        {
            ArrayList<Integer>path=getpath(arr,i, lv, visited);
            if(path.size()!=0)
            {
            path.add(fv);
            }
            return path;
           
        }
        i++;
    }
    ArrayList<Integer>path=new ArrayList<>();
return path;

}



    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int v=s.nextInt();
int arr[][]=new int[v][v];
int e=s.nextInt();
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

int fv=s.nextInt();
int lv=s.nextInt();
ArrayList<Integer>path=getpath(arr,fv,lv,visited);
i=0;
while(i<path.size())
{
    System.out.println(path.get(i));
    i++;
}

    }
}
