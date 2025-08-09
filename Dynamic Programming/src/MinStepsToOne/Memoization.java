package MinStepsToOne;
import java.util.Scanner;
public class Memoization {




public static int MinSteps(int n,int storage[])
{

if(n==1)
{
    return 0;
}

if(storage[n]!=-1)
{
    return storage[n];
}







int ans2=-1;
int ans3=-1;
    int ans1=MinSteps(n-1,storage);
    if(n%2==0)
    {
         ans2=MinSteps(n/2,storage);
    }
    if(n%3==0)
    {
         ans3=MinSteps(n/3,storage);
    }

    if(ans2!=-1&&ans3!=-1)
    {
        int finalans=Math.min(ans1,Math.min(ans2,ans3));
        storage[n]=finalans+1;
        return finalans+1;
    }
    if(ans2!=-1)
    {
        int finalans=Math.min(ans1,ans2);
        storage[n]=finalans+1;
        return finalans+1;
    }
   else if(ans3!=-1)
{
    int finalans=Math.min(ans1,ans3);
    storage[n]=finalans+1;
    return finalans+1;
}
else{
    storage[n]=ans1+1;
    return ans1+1;
}
   
}

    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int storage[]=new int[n+1];
        int i=0;
        while(i<n+1)
        {
            storage[i]=-1;
            i++;
        }
       int ans= MinSteps(n,storage);
       System.out.println(ans);

    }
}
