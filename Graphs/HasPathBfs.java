package Graphs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class HasPathBfs {
public static boolean Haspath(int[][]arr,boolean visited[],int fv,int lv)
{

Queue<Integer>q1=new LinkedList<>();
q1.add(fv);
visited[fv]=true;
while(q1.size()!=0)
{
int sv=q1.remove();
if(sv==lv)
{
    return true;
}
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
return false;


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
int fv=s.nextInt();
int lv=s.nextInt();
boolean ans=Haspath(arr,visited,fv,lv);
System.out.println(ans);


}

}
