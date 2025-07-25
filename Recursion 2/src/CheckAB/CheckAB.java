package CheckAB;

public class CheckAB {


//abababa
public static boolean Check(String str,int n)
{
  
if(n==0)
{
    if(str.charAt(n)=='a')
    {
    return true;
}
return false;
}



boolean ans=Check(str,n-1);
if(ans==false)
{
    return false;
}
else if(str.charAt(n)=='a')
{
    if(n+1>str.length()-1)
    {
      return true;  
    }
    else if(n+1<str.length()&&str.charAt(n+1)=='a')
    {
        return true;
    }
    else if(n+2<str.length()&&str.charAt(n+1)=='b'&&str.charAt(n+2)=='b')
    {
return true;
    }
    return false;
}
else if((str.charAt(n)=='b')&&(n+1<str.length())&&(str.charAt(n+1)=='b'))
{
    if((n+2>str.length()-1)||(n+2<str.length())&&(str.charAt(n+2)=='a'))
    {
return true;
    }
    return false;

}

return ans;



}
    public static void main(String[]args)
    {

    //     String str="abbbabaaa";
    String str="abababa";
       boolean ans= Check(str,str.length()-1);
       System.out.println(ans);
    }
}
