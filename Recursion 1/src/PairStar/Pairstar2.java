package PairStar;

public class Pairstar2 {


    public static String PairStar(String str,int n)
    {
    if(n==str.length()-1)
    {
        String ans="";
        ans+=str.charAt(n);
    return ans;
    }
    
    
        String ans=PairStar(str, n+1);
        if(str.charAt(n)==str.charAt(n+1))
        {
            ans="*"+ans;
        }
        
           ans= str.charAt(n)+ans;
        
    
    return ans;
    }
        public static void main(String[]args)
        {
            String str="abaa";
           String ans= PairStar(str,0);
           System.out.println(ans);
           
        }
    
    
        }
    
    


