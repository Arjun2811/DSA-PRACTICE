package ReplacePi;

public class Replace {

//pip
    public static String Replace(String str,int n)
    {
if(n==0)
{String smallans="";
     smallans+=str.charAt(0);
return smallans;
}

String ans=Replace(str,n-1);
if(str.charAt(n)=='i')
{
    if(str.charAt(n-1)=='p')
    {
        if(n==1)
        {
            String newans="3.14";
            return newans;
        }
ans+="3.14";
return ans;
    }
}
else if(str.charAt(n)=='p')
{
if(n+1<str.length()&&str.charAt(n+1)=='i')
{
return ans;
}
ans+='p';
return ans;
}

ans+=str.charAt(n);
return ans;

    }
    

    public static void main(String[]args)
    {
        String str="pip";
        String ans=Replace(str,str.length()-1);
        System.out.println(ans);
    }
}
