package ReturnSubsequences;

public class Subsequence {

//abc
    public static String[] subsequences(String str,int n)
    {
if(n<0)
{
    String arr[]={""};
    return arr;
}



String arr[]=subsequences(str,n-1);
String newarr[]=new String[arr.length*2];
int i=0;
while(i<arr.length)
{
    newarr[i]=arr[i];
    i++;
}
int f=0;
while(i<newarr.length)
{
newarr[i]=arr[f]+str.charAt(n);
i++;
f++;
}
return newarr;
   
}
   
    public static void main(String[]args)
    {
        String str="abc";
       String ans[]= subsequences(str,str.length()-1);
       for(String ele: ans)
       {
        System.out.println(ele);
       }
    }
}
