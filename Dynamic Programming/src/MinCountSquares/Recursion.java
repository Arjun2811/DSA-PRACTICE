package MinCountSquares;
import java.util.Scanner;
public class Recursion {



public static int MinCount(int n)
{
    if(n==0)
    {
        return 0;
    }

int i=1;
int min=Integer.MAX_VALUE;
while(i*i<=n)
{


    int ans=MinCount(n-i*i);
    if(ans<min)
    {

        min=ans;
    }
 
i++;
}
return min+1;


}




public static void main(String[]args)
{Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int ans=MinCount(n);
    System.out.println(ans);
}
}
