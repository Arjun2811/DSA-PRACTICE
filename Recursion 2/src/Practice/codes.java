package Practice;
import java.util.Scanner;
public class codes {





public static int Multiply(int n,int m)
{
if(n==1)
{
    return m;
}

if(m==0||n==0)
{
    return 0;
}
if(m==1)
{
    return n;
}




int ans=Multiply(n, m-1);
ans+=n;
return ans;


}

    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
int n=s.nextInt();
int m =s.nextInt();
int ans=Multiply(n,m);
System.out.println(ans);


}


}