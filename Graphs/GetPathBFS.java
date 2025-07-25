package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetPathBFS {



public static void getpath(int [][]arr,int sv,int lv, boolean visited[])
{
HashMap<Integer,Integer>map=new HashMap<>();

Queue<Integer>q1=new LinkedList<>();
q1.add(sv);
visited[sv]=true;
while(!q1.isEmpty())
{
    int value=q1.poll();
    int i=0;
    while(i<arr.length)
    {

        if(arr[value][i]==1&&visited[i]==false)
        {
   map.put(i,value);
   if(i==lv)
   {System.out.println(lv);
    int ans=-1;
    while(ans!=sv)
    {
        ans= map.get(i);
        System.out.println(ans);
        i=ans;
       
    }
    return;
   }
       q1.add(i);
       visited[i]=true;

        }
        i++;
    }
}




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
getpath(arr,fv,lv,visited);

}

}
