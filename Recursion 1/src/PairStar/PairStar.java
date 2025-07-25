package PairStar;

public class PairStar {
//hello
public static String PairStar(String str,int n)
{
if(n<0)
{
    String ans="";
return ans;
}





String ans=PairStar(str,n-1);

if(((n+1)<str.length()) && (str.charAt(n)==(str.charAt(n+1))))
{


    ans+=str.charAt(n);
    ans+="*";
}
else{
    ans+=str.charAt(n);
}
return ans;



}
    public static void main(String[]args)
    {
        // String str="ababaab";
        String str="Hello";
        String ans=PairStar(str,str.length()-1);
        System.out.println(ans);
    }
}
