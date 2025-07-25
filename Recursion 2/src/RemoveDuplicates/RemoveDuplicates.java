package RemoveDuplicates;

public class RemoveDuplicates {

public static String Remove(String str,int n)
{
if(n==str.length()-1)
{
    String ans="";
    ans+=str.charAt(n);
    return ans;
}


String ans=Remove(str,n+1);
if(str.charAt(n)!=str.charAt(n+1))
{
    ans=str.charAt(n)+ans;
}
return ans;

}

    public static void main(String[]args)
    {
        String str="acde";
       String ans= Remove(str,0);
       System.out.println(ans);
    }
}
