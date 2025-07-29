package PrismAlgorithm;
import java.util.Scanner;
public class Prism {






public static void print(int[]parent,int[]weight)
{
    int i=1;
    while(i<parent.length)
    {
       if(parent[i]<i)
       {
        System.out.println(parent[i]+" "+i+" "+weight[i]);
       }
       else{
        System.out.println(parent[i]+" "+i+" "+weight[i]);

       }
    }
}








public static int findminvertex(boolean[]visited,int weight[])
{
int min=Integer.MAX_VALUE;
int minvalue=-1;
int i=0;
while(i<visited.length)
{
    if(visited[i]==false&&weight[i]<min)
    {
min=weight[i];
minvalue=i;
    }
    i++;
    
}
return minvalue;



}




public static void prism(int[][]arr,int v,int e)
{

boolean visited[]=new boolean[v];
int weight[]=new int[v];
int parent[]=new int[v];
weight[0]=0;
int i=1;
while(i<weight.length)
{
    weight[i]=Integer.MAX_VALUE;
    i++;
}
parent[0]=-1;
int f=0;
while(f<v)
{

int minvertex=findminvertex(visited,weight);
visited[minvertex]=true;

int g=0;
while(g<v)
{
if(arr[minvertex][g]!=0&&visited[g]==false&&weight[g]>arr[minvertex][g])
{
weight[g]=arr[minvertex][g];
parent[g]=minvertex;

}
g++;
}
f++;
}


print(parent,weight);
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
    int weight=s.nextInt();
    arr[fv][lv]=weight;
    arr[lv][fv]=weight;
    i++;
}
prism(arr,v,e);
    }
}
