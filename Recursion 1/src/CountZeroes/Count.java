package CountZeroes;
import java.util.Scanner;
import java.util.Scanner;

public class Count {

    public static int Count(int n)
    {
        if(n==0)
        {
            return 0;
        }
       
        



        int ans=Count(n/10);
        if(n%10==0)
        {
            ans+=1;
        }
        return ans;

    }

public static int count2()
{
return 1;
}


    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        if(n==0)
        {
           System.out.println(count2()); 
           return;
        }
        System.out.println(Count(n));
      
    }
}
