package SmallestSuperSequence;
import java.util.Scanner;
public class DP {
    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);

        String str1=s.next();
        String str2=s.next();
        int m=str1.length();
        int n=str2.length();
        int i=0;
        int j=0;
        int arr[][]=new int[m+1][n+1];
        int f=0;
        while(j<n+1)
        {
         arr[i][j]=f;
          j++;
          f++;
        }
        i=0;
        j=0;
        f=0;
        while(i<m+1)
        {
            arr[i][j]=f;
            i++;
            f++;
        }
         i=1;
         while(i<m+1)
         {
            j=1;
            while(j<n+1)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=Math.min(arr[i-1][j],arr[i][j-1])+1;
                }
                j++;
            }
            i++;
         }
         System.out.println(arr[m][n]);



    }
}
