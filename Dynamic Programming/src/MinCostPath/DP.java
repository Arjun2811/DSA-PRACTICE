package MinCostPath;
import java.util.Scanner;
public class DP {


    public static void main(String[]args)
    {Scanner s =new Scanner(System.in);

        int m=s.nextInt();
        int n=s.nextInt();

        int arr[][]=new int[m][n];
        int i=0;
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
        int storage[][]=new int[m][n];
        storage[0][0]=arr[0][0];
        
        int f=1;
        while(f<arr[0].length)
        {
storage[0][f]=storage[0][f-1]+arr[0][f];
f++;
        }
        int z=1;
        while(z<arr.length)
        {
            storage[z][0]=storage[z-1][0]+arr[z][0];
            z++;
        }
        i=1;
        while(i<m)
      {
        int j=1;
        while(j<n)
        {

storage[i][j]=arr[i][j]+Math.min(storage[i][j-1],Math.min(storage[i-1][j],storage[i-1][j-1]));
j++;

        }
        i++;
      }
System.out.println(storage[m-1][n-1]);

    }
}
