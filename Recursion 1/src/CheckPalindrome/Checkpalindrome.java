package CheckPalindrome;

public class Checkpalindrome {

public static boolean Checkpalindrome(String str,int i,int j)
{
if(i>=j)
{
    return true;
}
if(str.charAt(i)!=str.charAt(j))
{
return false;
}


boolean ans=Checkpalindrome(str, i+1, j-1);
return ans;

}
    public static void main(String[] args) {
        String str="aroraa";
       boolean ans= Checkpalindrome(str,0,str.length()-1);
       System.out.println(ans);
    }
}
