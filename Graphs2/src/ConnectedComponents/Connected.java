package ConnectedComponents;
import java.util.ArrayList;
import java.util.Scanner;
public class Connected {



public static void DFS(int[][]arr,boolean visited[],int fv,ArrayList arr2)
{


    arr2.add(fv);
    visited[fv]=true;
    int i=0;
    while(i<arr.length)
    {
if(arr[fv][i]==1&&visited[i]==false)
{

    DFS(arr,visited,i,arr2);
}
i++;

    }



}





public static ArrayList<ArrayList<Integer>> helper(int arr[][])
{
ArrayList<ArrayList<Integer>>arr1=new ArrayList<>();
boolean visited[]=new boolean[arr.length];
int i=0;


while(i<visited.length)
{
    
if(visited[i]==false)
{ ArrayList<Integer>arr2=new ArrayList<>();
    DFS(arr,visited,i,arr2);
    arr1.add(arr2);
}
i++;
}

return arr1;


}




    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);

        int v=s.nextInt();
        int e=s.nextInt();
        int arr[][]=new int[v][v];
        int i =0;
        while(i<e)
        {
            int fv=s.nextInt();
            int lv=s.nextInt();
            arr[fv][lv]=1;
            arr[lv][fv]=1;
            i++;
        }
        ArrayList<ArrayList<Integer>>arr1=helper(arr);
    i=0;
        while(i<arr1.size())
        {
            int j=0;
            while(j<arr1.get(i).size())
            {
            System.out.print(arr1.get(i).get(j)+" ");
            j++;
            }
            System.out.println();
            i++;
        }

    }
}
