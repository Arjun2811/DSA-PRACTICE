package ReplacePi;

public class Replace2 {

    public static String replace(String str,int n)
    {
    if(n==str.length()-1)
    {String ans="";
        if(str.charAt(n)=='i')
        {
        return ans;
        }
        else{
            ans+=str.charAt(n);
            return ans;
        }
    }
    
    
    String ans=replace(str,n+1);
    if(str.charAt(n+1)=='i'&&str.charAt(n)=='p')
    {
        ans="3.14"+ans;
        return ans;
    }
    else if(str.charAt(n)=='i'&&str.charAt(n-1)=='p')
    {
    return ans;
    }
    else{
        ans=str.charAt(n)+ans;
        return ans;
    }
    
    }
    
        public static void main(String[]args)
        {
    String str="pip";
    String ans=replace(str,0);
    System.out.println(ans);
     }
    
    
        }
    
    





