package XraisetoPowerN;
import java.util.Scanner;
public class Power {

    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        
        
        
    
        int ans=power(x,n-1);
        ans*=x;
        return ans;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int n =s.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
    }
}
