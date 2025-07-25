package SumOfDigits;
import java.util.Scanner;
public class Sum {
//112
    public static int Sum(int n)
    {
        if(n==0)
        {
            return 0;
        }




       int ans= Sum(n/10);

       ans+=n%10;
       return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int ans=Sum(n);
        System.out.println(ans);
    }
}
