package SmallestSuperSequence;
import java.util.Scanner;
public class Recursion {


public static int Smallest(String str,String str1,int n,int m)
{

if(n<0)
{
return m+1;
}
if(m<0)
{
return n+1;
}

    if(str.charAt(n)==str1.charAt(m))
    {
       int ans= Smallest(str,str1,n-1,m-1);
       return ans+1;
    }
    else{
        int ans1=Smallest(str,str1,n,m-1);
        int ans2=Smallest(str,str1,n-1,m);
        return Math.min(ans1,ans2)+1;
    }
}







    public static void main(String[]args)
    {
Scanner s = new Scanner(System.in);
        String str=s.next();
        String str1=s.next();
        int ans=Smallest(str,str1,str.length()-1,str1.length()-1);
        System.out.println(ans);
    }
}
