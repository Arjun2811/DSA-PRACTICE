package MinStepsToOne;
import java.util.Scanner;
public class Recursion {




public static int MinSteps(int n)
{

if(n==1)
{
    return 0;
}

int ans2=-1;
int ans3=-1;
    int ans1=MinSteps(n-1);
    if(n%2==0)
    {
         ans2=MinSteps(n/2);
    }
    if(n%3==0)
    {
         ans3=MinSteps(n/3);
    }

    if(ans2!=-1&&ans3!=-1)
    {
        int finalans=Math.min(ans1,Math.min(ans2,ans3));
        return finalans+1;
    }
    if(ans2!=-1)
    {
        int finalans=Math.min(ans1,ans2);
        return finalans+1;
    }
   else if(ans3!=-1)
{
    int finalans=Math.min(ans1,ans3);
    return finalans+1;
}
else{
    return ans1+1;
}
   
}

    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        int n=s.nextInt();
       int ans= MinSteps(n);
       System.out.println(ans);

    }
}
