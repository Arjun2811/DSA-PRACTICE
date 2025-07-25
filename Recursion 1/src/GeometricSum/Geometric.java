package GeometricSum;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Geometric {

//1+1/2+1/4+1/8
public static double geometric(int k)
{
if(k==0)
{
    return 1;
}



double ans=geometric(k-1);
int i=0;
double smallans=1;
while(i<k)
{
 smallans*=2;
i++;
}
double finalans=1/smallans;
ans+=finalans;
return ans;

}

    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        int k=s.nextInt();
        double ans=geometric(k);
        DecimalFormat dec= new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));


    }
}
