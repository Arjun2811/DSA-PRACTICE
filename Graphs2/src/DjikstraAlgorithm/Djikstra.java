package DjikstraAlgorithm;
import java.util.Scanner;
public class Djikstra {

    



public static void print(int[]distance)
{
    int i=0;
    while(i<distance.length)
    {
        System.out.println(i+" "+distance[i]);
        i++;
    }
}


public static int findminvertex(boolean[]visited,int[]distance)
{


    int minvalue=0;
int min=Integer.MAX_VALUE;
    int i=0;
    while(i<visited.length)
    {
        if(visited[i]==false&&distance[i]<min)
        {
            min=distance[i];
            minvalue=i;
        }
        i++;
    }

return minvalue;


}


public static void Djikstra(int[][]arr)
{
    int v=arr.length;
    int distance[]=new int[v];
    boolean visited[]=new boolean[v];
    distance[0]=0;
    int i=1;
    while(i<v)
    {
        distance[i]=Integer.MAX_VALUE;
        i++;
    }
    i=0;
    while(i<v)
    {
       int minvertex= findminvertex(visited,distance);
       visited[minvertex]=true;

       int f=0;
       while(f<v)
       {
        if(arr[minvertex][f]!=0&&visited[f]==false&&distance[minvertex]+arr[minvertex][f]<distance[f])
        {
            distance[f]=distance[minvertex]+arr[minvertex][f];

        }
        f++;
       }
       i++;
    }
    print(distance);
}




    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int v=s.nextInt();
        int e=s.nextInt();
        int [][]arr=new int[v][v];
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
        Djikstra(arr);
    }
}
