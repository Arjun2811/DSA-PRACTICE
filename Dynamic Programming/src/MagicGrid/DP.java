package MagicGrid;
import java.util.Scanner;
public class DP {

    
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        int i=0;
        int j=0;
        while(i<n)
        {
             j=0;
            while(j<m)
            {
                arr[i][j]=s.nextInt();
                j++;
            }
            i++;
        }
        int strength[][]=new int[n][m];
        strength[n-1][m-1]=1;
        strength[n-2][m-1]=1;
        strength[n-1][m-2]=1;
        i=n-1;
        j=m-3;
        while(j>=0)
        {
            strength[i][j]=strength[i][j+1]-arr[i][j+1];
            if(strength[i][j]<=0)
            {
                strength[i][j]=1;
            }
            j--;
        }
        i=n-2;
        j=m-2;
        while(j>=0)
        {
            strength[i][j]=Math.min(strength[i][j+1]-arr[i][j+1],strength[i+1][j]-arr[i+1][j]);
            if(strength[i][j]<=0)
            {
                strength[i][j]=1;
            }
            j--;
        }
        i=n-3;
        while(i>=0)
        {
            j=m-1;
            while(j>=0)
            {if(j+1>=m)
                {
                    strength[i][j]=strength[i+1][j]-arr[i+1][j];
                    if(strength[i][j]<=0)
                    {
                        strength[i][j]=1;
                    }
                    j--;
                }
                else{
                strength[i][j]=Math.min(strength[i][j+1]-arr[i][j+1],strength[i+1][j]-arr[i+1][j]);
                if(strength[i][j]<=0)
                {
                    strength[i][j]=1;
                }
                j--;
            }
        }
        i--;



    }
    System.out.println(strength[0][0]);
}
}
