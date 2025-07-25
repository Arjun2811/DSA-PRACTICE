package StringToInteger;

public class Stringtointeger {



public static int Stringtointeger(String str,int n,int i)
{
if(n==0)
{
    if(i==0)
    {
        return 0;
    }
int f=0;
int value=str.charAt(n)-'0';
while(f<i)
{

value*=10;
f++;
}
return value;
}

int ans=Stringtointeger(str,n-1,i+1);
int value=str.charAt(n)-'0';
int f=0;
while(f<i)
{
    value*=10;
    f++;
}
ans+=value;
return ans;

}

    public static void main(String[]args)
    {
        // String str="000000123400009";
        String str="15667";
        int ans=Stringtointeger(str,str.length()-1,0);
        System.out.println(ans);
    }
}
