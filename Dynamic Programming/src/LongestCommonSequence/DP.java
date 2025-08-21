package LongestCommonSequence;
import java.util.Scanner;
public class DP {



    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        int m=str1.length();
        int n=str2.length();
        int storage[][]=new int[m+1][n+1];
        int i=m;
        int j=0;
        while(j<n+1)
        {
            storage[i][j]=0;
            j++;
        }
    j=n;
        i=0;
        while(i<m+1)
        {
            storage[i][j]=0;
            i++;
        }
        i=m-1;
   
        while(i>=0)
        { j=n-1;
        while(j>=0)
        {

if(str1.charAt(i)==str2.charAt(j))
{
   storage[i][j]= storage[i+1][j+1]+1;
}
else{
    storage[i][j]=Math.max(storage[i][j+1],storage[i+1][j]);
}
            j--;
        }
        i--;
    }
    System.out.println(storage[0][0]);
      
    }
}
