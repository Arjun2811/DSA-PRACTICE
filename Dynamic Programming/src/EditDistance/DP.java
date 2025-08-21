package EditDistance;

import java.util.Scanner;

public class DP {



    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);

        String str1=s.next();
        String str2=s.next();
        int storage[][]=new int[str1.length()+1][str2.length()+1];
        int i=str1.length();
        int j=str2.length();
        while(j>=0)
        {
        storage[i][j]=0;
         j--;
        }
         j=str2.length();
          i=str1.length();
          while(i>=0)
          {
          storage[i][j]=0;
          i--;
          }

i=str1.length()-1;

while(i>=0)
{
    j=str2.length()-1;
    while(j>=0)
    {

        if(str1.charAt(i)==str2.charAt(j))
        {
            storage[i][j]=storage[i+1][j+1];
        }
        else{
            storage[i][j]=Math.min(storage[i+1][j+1],Math.min(storage[i][j+1],storage[i+1][j]))+1;
        }
        j--;
    }
    i--;
}
System.out.println(storage[0][0]);


    }
}
