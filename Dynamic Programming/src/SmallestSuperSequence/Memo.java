package SmallestSuperSequence;

import java.util.Scanner;

public class Memo {





public static int Smallest(String str,String str1,int n,int m,int [][]storage)
{

if(n<0)
{
return m+1;
}
if(m<0)
{
return n+1;
}

if(storage[n][m]!=-1)
{
    return storage[n][m];
}


    if(str.charAt(n)==str1.charAt(m))
    {
       int ans= Smallest(str,str1,n-1,m-1,storage);
storage[n][m]=ans+1;
       return ans+1;
    }
    else{
        int ans1=Smallest(str,str1,n,m-1,storage);
        int ans2=Smallest(str,str1,n-1,m,storage);
        storage[n][m]=Math.min(ans1,ans2)+1;
        return Math.min(ans1,ans2)+1;
    }
}







    public static void main(String[]args)
    {
Scanner s = new Scanner(System.in);
        String str=s.next();
        String str1=s.next();
        int[][]storage=new int[str.length()][str1.length()];
        int i=0;
        while(i<str.length())
        {
            int j=0;
            while(j<str1.length())
            {
                storage[i][j]=-1;
                j++;
            }
            i++;
        }
        int ans=Smallest(str,str1,str.length()-1,str1.length()-1,storage);
        System.out.println(ans);
    }
}







