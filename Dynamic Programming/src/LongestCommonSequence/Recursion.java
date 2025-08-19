package LongestCommonSequence;
import java.util.Scanner;
public class Recursion {


    public static int LCS(String str1,String str2,int i,int j)
    {
if(i>=str1.length()||j>=str2.length())
{
   return 0;
}

if(str1.charAt(i)==str2.charAt(j))
{

   int finalans= LCS(str1,str2,i+1,j+1);
 
   return finalans+1;
}
else{

  
    int value2=LCS(str1,str2,i,j+1);
    int value3=LCS(str1,str2,i+1,j);
   
    return Math.max(value2,value3);
}

    }


    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        String str=s.next();
        String str1=s.next();
        int ans=LCS(str,str1,0,0);
        System.out.println(ans);
    }
}
