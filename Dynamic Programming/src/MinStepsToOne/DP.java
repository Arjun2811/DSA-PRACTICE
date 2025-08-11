package MinStepsToOne;
import java.util.Scanner;
public class DP {



    public static void main(String[]args)
    {
        Scanner  s= new Scanner(System.in);
        int n=s.nextInt();
        int storage[]=new int[n+1];
        storage[1]=0;
        
        
        int i=2;
        while(i<n+1)
        {
            if(i%2==0&&i%3==0)
            {
                int b=storage[i/2];
                int c=storage[i/3];
                int ans=Math.min(storage[i-1],Math.min(b, c));
                storage[i]=ans+1;
            }
            else if(i%2==0)
            {
                int b=storage[i/2];
                int ans=Math.min(storage[i-1],b);
                storage[i]=ans+1;
            }
            else if(i%3==0)
            {
                int b=storage[i/3];
                int ans=Math.min(storage[i-1],b);
                storage[i]=ans+1;
            }
            else{
                storage[i]=storage[i-1]+1;

            }
           i++;
        }
        System.out.println(storage[n]);
    }
}
