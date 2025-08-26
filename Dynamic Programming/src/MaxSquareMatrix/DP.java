package MaxSquareMatrix;
import java.util.Scanner;
public class DP {

    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
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
int storage[][]=new int[m+1][n+1];
i=0;
int j=0;
while(i<m+1)
{
storage[i][j]=0;
i++;
}
i=0;
while(j<n+1)
{
    storage[i][j]=0;
    j++;

}
i=1;
int maxvalue=-1;
while(i<m+1)
{
    j=1;
    while(j<n+1)
    {
if(i<m&&j<n&&arr[i-1][j-1]==1)
{
storage[i][j]=0;
}
else{
    storage[i][j]=Math.min(storage[i-1][j],Math.min(storage[i][j-1],storage[i-1][j-1]))+1;
  
}
if(storage[i][j]>maxvalue)
{
    maxvalue=storage[i][j];
}


        j++;
    }
    i++;
}
System.out.println(maxvalue);

    }
}
