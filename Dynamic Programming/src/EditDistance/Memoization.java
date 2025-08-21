package EditDistance;

import java.util.Scanner;

public class Memoization {

public static int EditDistance(String str1,String str2,int[][]storage)
{
if(str1.length()==0)
{
    return str2.length();
}
if(str2.length()==0)
{
    return str1.length();
}

if(storage[str1.length()][str2.length()]!=-1)
{
    return storage[str1.length()][str2.length()];
}

    if(str1.charAt(0)==str2.charAt(0))
    {
        int ans=EditDistance(str1.substring(1),str2.substring(1),storage);
        storage[str1.length()][str2.length()]=ans;
        return ans;
    }

    else{
        int ans1=EditDistance(str1, str2.substring(1),storage);
        int ans2=EditDistance(str1.substring(1), str2,storage);
        int ans3=EditDistance(str1.substring(1),str2.substring(1),storage);
        storage[str1.length()][str2.length()]=Math.min(ans1,Math.min(ans2,ans3))+1;
        return Math.min(ans1,Math.min(ans2,ans3))+1;
    }

}

    public static void main(String[]args)
    {
Scanner s = new Scanner(System.in);
String str1=s.next();
String str2=s.next();
int storage[][]=new int[str1.length()+1][str2.length()+1];
int i=0;
while(i<str1.length()+1)
{
    int j=0;
    while(j<str2.length()+1)
    {


storage[i][j]=-1;


        j++;
    }
    i++;
}
       int ans= EditDistance(str1,str2,storage);
       System.out.println(ans);
        
    }




}
