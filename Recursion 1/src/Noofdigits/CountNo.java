package Noofdigits;

public class CountNo {




public static int CountNo(int n)
{
if(n==0)
{
return 0;
}


    int ans=CountNo(n/10);
    ans+=1;
    return ans;
}



    public static void main(String[] args) {
        
        int n=235;
       int ans= CountNo(n);
       System.out.println(ans);
    }
}
