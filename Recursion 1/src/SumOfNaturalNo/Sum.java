package SumOfNaturalNo;
import java.util.Scanner;
public class Sum {

public static int Sum(int n)
{if(n==0)
    {
        return 0;
    }


    int ans=Sum(n-1);
    ans+=n;
    return ans;
}

    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int ans=Sum(n);
        System.out.println(ans);
    }
}
