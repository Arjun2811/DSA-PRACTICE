package RemoveX;

public class Remove {

//aaxx
public static String Remove(String str,int n)
{
if(n==0)
{
    if(str.charAt(n)=='x')
    {
        return "";
    }
    else{
        String smallans="";
        smallans+=str.charAt(n);
        return smallans;
    }

}



String ans=Remove(str,n-1);
if(str.charAt(n)=='x')
{
    return ans;
}
else{
    ans+=str.charAt(n);
    return ans;
}

}

    public static void main(String[]args)
    {
        String str="aaxbxabc";
       String ans= Remove(str,str.length()-1);
       System.out.println(ans);
    }
}
