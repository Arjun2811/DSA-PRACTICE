package ISConnectedBFS;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Isconnected {


    public static void isconnected(int[][]arr,boolean[]visited,int fv)
    {
    
    visited[fv]=true;
    Queue<Integer>q1=new LinkedList<>();
    q1.add(fv);
    while(!q1.isEmpty())
    {
        int value=q1.poll();

        int i=0;
        while(i<arr.length)
        {
            if(arr[value][i]==1&&visited[i]==false)
            {
                q1.add(i);
                visited[i]=true;
            }
            i++;
        }
    }
    }
    
    
    
    
    public static boolean helper(int[][]arr)
    {
    
    
        boolean visited[]=new boolean[arr.length];
            isconnected(arr,visited,0);
            int i=0;
            while(i<arr.length)
            {
    if(visited[i]==false)
    {
    return false;
    }
    i++;
    }
    return true;
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
         
      System.out.println(helper(arr));
            }
        }
    
    
