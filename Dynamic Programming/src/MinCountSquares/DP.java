package MinCountSquares;
import java.util.Scanner;
public class DP {






    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        int storage[]=new int[n+1];
        int i=1;
        storage[0]=0;
      
        while(i<n+1)
        {
int min=Integer.MAX_VALUE;
            int f=1;
            while(f*f<=i)
            {
            if(storage[i-(f*f)]<min)
            {
                min=storage[i-(f*f)];
            }
               f++;
            }
storage[i]=min+1;

i++;
        }
        System.out.println(storage[n]);
        
    }
}
