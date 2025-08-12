package ByteLandian;
import java.util.Scanner;
public class Recursion {






public static int ByteLandian(int n)
{

    if(n==0)
    {
        return 0;
    }
if(n==1)
{
    return 1;
}





    int a=ByteLandian(n/2);
    int b=ByteLandian(n/3);
    int c=ByteLandian(n/4);
    if(a+b+c>n)
    {
        return a+b+c;
    }
    else{
        return n;
    }
}








    public static void main(String[]args)
    {
Scanner s = new Scanner(System.in);
        int n=s.nextInt();
       int ans= ByteLandian(n);
       System.out.println(ans);

    }
}
