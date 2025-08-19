package LongestCommonSequence;

import java.util.Scanner;

public class Memo {




    public static int LCS(String str1,String str2,int i,int j,int[][]storage)
    {
if(i>=str1.length()||j>=str2.length())
{
   return 0;
}

if(storage[i][j]!=-1)
{
    return storage[i][j];
}


if(str1.charAt(i)==str2.charAt(j))
{

   int finalans= LCS(str1,str2,i+1,j+1,storage);
   storage[i][j]=finalans+1;
   return finalans+1;
}
else{

  
    int value2=LCS(str1,str2,i,j+1,storage);
    int value3=LCS(str1,str2,i+1,j,storage);
    storage[i][j]= Math.max(value2,value3);
    return Math.max(value2,value3);
}

    }


    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        String str=s.next();
        String str1=s.next();
        int storage[][]=new int[str.length()+1][str1.length()+1];
        int i=0;
        while(i<str.length()+1)
        {
            int j=0;
            while(j<str1.length()+1)
            {
                storage[i][j]=-1;
                j++;
            }
            i++;
        }

        int ans=LCS(str,str1,0,0,storage);
        System.out.println(ans);
    }
}

