package Graphs;
import java.util.Scanner;
public class Haspathdfs {




public static boolean Haspath(int[][]arr,int fv,int lv,boolean visited[])
{

    visited[fv]=true;
    if(fv==lv)
    {
        return true;
    }

int i=0;
while(i<arr.length)
{

if(arr[fv][i]==1&&visited[i]==false)
{

    boolean ans=Haspath(arr,i,lv,visited);
    return ans;

}
i++;
}
return false;



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
boolean ans=Haspath(arr,fv,lv,visited);
System.out.println(ans);




    }
}
