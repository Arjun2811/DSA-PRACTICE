package EditDistance;
import java.util.Scanner;
public class Recursion {



public static int EditDistance(String str1,String str2)
{
if(str1.length()==0)
{
    return str2.length();
}
if(str2.length()==0)
{
    return str1.length();
}



    if(str1.charAt(0)==str2.charAt(0))
    {
        int ans=EditDistance(str1.substring(1),str2.substring(1));
        return ans;
    }

    else{
        int ans1=EditDistance(str1, str2.substring(1));
        int ans2=EditDistance(str1.substring(1), str2);
        int ans3=EditDistance(str1.substring(1),str2.substring(1));
        return Math.min(ans1,Math.min(ans2,ans3))+1;
    }

}

    public static void main(String[]args)
    {
Scanner s = new Scanner(System.in);
String str1=s.next();
String str2=s.next();

       int ans= EditDistance(str1,str2);
       System.out.println(ans);
        
    }
}
