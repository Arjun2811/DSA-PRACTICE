package Practice2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class GraphQuestion {



public static void DFS(int[][]arr,int fv,boolean []visited,ArrayList<Integer>arrsmall)
{

visited[fv]=true;
arrsmall.add(fv);

int i=0;
while(i<arr.length)
{
    if(arr[fv][i]==1&&visited[i]==false)
    {
        DFS(arr,i,visited,arrsmall);
    }
    i++;
}

}




public static ArrayList<ArrayList<Integer>> helper(int[][]arr,int v,int e)
{

boolean visited[]=new boolean[v];
int i=0;
int count=0;

ArrayList<ArrayList<Integer>> arrlist=new ArrayList<>();
while(i<v)
{
    if(visited[i]==false)
    { ArrayList<Integer>arrsmall=new ArrayList<>();
        DFS(arr,i,visited,arrsmall);
        arrlist.add(arrsmall);
    }
    i++;
}


return arrlist;

}





    public static void main(String[]args)
    {
      
        Scanner s = new Scanner(System.in);
        int v=s.nextInt();
        int e =s.nextInt();
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
        ArrayList<ArrayList<Integer>>arrlist=helper(arr,v,e);
        int x=0;
        while(x<arrlist.size())
        {
Collections.sort(arrlist.get(x));
            int y=0;
            while(y<arrlist.get(x).size())
            {
                System.out.print(arrlist.get(x).get(y)+" ");
                y++;
            }
            System.out.println();
            x++;

        }
  
    }
}
