package MinCostPath;

import java.util.Scanner;

public class Memoization {



    public static int MinCostPath(int[][]arr,int i,int j,int storage[][])
{
    if(i==arr.length-1&&j==arr[0].length-1)
    {
return arr[i][j];
    }
    if(i==arr.length||j==arr[0].length)
    {
return Integer.MAX_VALUE;
    }


if(storage[i][j]!=-1)
{
    return storage[i][j];
}

   int ans1=MinCostPath(arr, i, j+1,storage);

 
int ans2=MinCostPath(arr, i+1, j+1,storage);


   int ans3=MinCostPath(arr, i+1, j,storage);



  int finalans= Math.min(ans1,Math.min(ans2, ans3));
  finalans+=arr[i][j];
  storage[i][j]=finalans;
  return finalans;

}



    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int storage[][]=new int[m][n];

int x=0;
        while(x<m)
        {
            int y=0;
            while(y<n)
            {
                storage[x][y]=-1;
                y++;
            }
            x++;
        }



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
       int ans= MinCostPath(arr,0,0,storage);
       System.out.println(ans);
    }
}


