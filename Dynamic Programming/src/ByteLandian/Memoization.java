package ByteLandian;

import java.util.HashMap;
import java.util.Scanner;

public class Memoization {






public static Long ByteLandian(Long n,HashMap<Long,Long>memo)
{

    if(n==0)
    {
        memo.put(n,n);
        return memo.get(n);
    }
if(n==1)
{
    memo.put(n,n);
        return memo.get(n);
}

if(memo.containsKey(n))
{
    return memo.get(n);
}




    Long a=ByteLandian(n/2,memo);
    Long b=ByteLandian(n/3,memo);
    Long c=ByteLandian(n/4,memo);
    if(a+b+c>n)
    {
        memo.put(n, a+b+c);
        return a+b+c;
    }
    else{
        memo.put(n,n);
        return n;
    }



}





    public static void main(String[]args)
    {
Scanner s = new Scanner(System.in);
       Long n=s.nextLong();
       HashMap<Long,Long>memo=new HashMap<>();
       Long ans= ByteLandian(n,memo);
       System.out.println(ans);

    }
}







