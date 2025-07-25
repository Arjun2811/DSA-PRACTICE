package ReplaceCharacterRecursively;

public class ReplaceChar {

//aacd
public static String ReplaceChar(String str,int n,char ch,char ch1)
{
if(n==0)
{String ans="";
    if(str.charAt(n)==ch)
    { 
        ans+=ch1;
        return ans;
    }
    else{
        ans+=str.charAt(n);
        return ans;
    }
}
String ans=ReplaceChar(str,n-1,ch,ch1);
if(str.charAt(n)==ch)
{

    ans+=ch1;
}
else{
    ans+=str.charAt(n);
}

return ans;
}
    public static void main(String[]args)
    {
        String str="aaadddaaaccc";
        String ans=ReplaceChar(str,str.length()-1,'d','x');
        System.out.println(ans);
    }
}
