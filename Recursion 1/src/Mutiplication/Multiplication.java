package Mutiplication;
import java.util.Scanner;
public class Multiplication {


//5,3
public static int Multiplication(int a ,int b)
{
if(a==0||b==0)
{
    return 0;
}
if(b==1)
{
return a;
}
if(a==1)
{
    return b;
}



int ans=Multiplication(a, b-1);
ans+=a;
return ans;


}
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int b=s.nextInt();
       int ans= Multiplication(a,b);
       System.out.println(ans);
    }
}
