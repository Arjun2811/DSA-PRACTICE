package MinChocolates;
import java.util.Scanner;
public class DP {





    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
int n=s.nextInt();
if(n==1)
{
    System.out.println(1);
    return;
}

int arr[]=new int[n];
int i=0;
while(i<n)
{
    arr[i]=s.nextInt();
    i++;
}

// frontphase
int dp[]=new int[n];

if(arr[0]>arr[1])
{
    dp[0]=2;
}
else{
    dp[0]=1;
}
i=1;
while(i<n)
{
if(arr[i]>arr[i-1])
{
    dp[i]=dp[i-1]+1;
}
else{
    dp[i]=1;
}
i++;
}
// backphase

i=n-2;
while(i>=0)
{
    if(arr[i]>arr[i+1]&&dp[i+1]>=dp[i])
    {
        dp[i]=dp[i+1]+1;
    }
  i--;
}

i=0;
int ans=0;
while(i<n)
{
    ans+=dp[i];
    i++;
}
System.out.println(ans);

    }
}
