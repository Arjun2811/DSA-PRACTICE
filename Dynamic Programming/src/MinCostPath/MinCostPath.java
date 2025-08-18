package MinCostPath;
import java.util.Scanner;
public class MinCostPath {



public static int MinCostPath(int[][]arr,int i,int j)
{
    if(i==arr.length-1&&j==arr[0].length-1)
    {
return arr[i][j];
    }
    if(i==arr.length||j==arr[0].length)
    {
return Integer.MAX_VALUE;
    }




   int ans1=MinCostPath(arr, i, j+1);

 
int ans2=MinCostPath(arr, i+1, j+1);


   int ans3=MinCostPath(arr, i+1, j);



  int finalans= Math.min(ans1,Math.min(ans2, ans3));
  finalans+=arr[i][j];
  return finalans;

}



    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int i=0;
        int arr[][]=new int[m][n];
        while(i<m)
        {
            int j=0;
            while(j<n)
            {
                arr[i][j]=s.nextInt();
                j++;
            }
            i++;
        }
       int ans= MinCostPath(arr,0,0);
       System.out.println(ans);
    }
}
