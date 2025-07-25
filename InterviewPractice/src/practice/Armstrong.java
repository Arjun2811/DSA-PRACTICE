package practice;

public class Armstrong {

//375

public static boolean armstrong(int n)
{
    int original=n;
int count =0;
int i=n;
int finalans=0;
while(n>0)
{
    n=n/10;
    count++;
}
while(i>0)
{int ans=1;
    int a=i%10;
    i=i/10;
    int f=0;
    while(f<count)
    {
        ans*=a;
        f++;
    }
    finalans+=ans;
}
if(finalans==original)
{
    return true;
}
else{
    return false;
}
}
    public static void main(String[]args)
    {
        int n=370;
        boolean ans=armstrong(n);
        System.out.println(ans);
    }
}
