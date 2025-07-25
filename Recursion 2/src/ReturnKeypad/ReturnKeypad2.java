package ReturnKeypad;

import java.util.ArrayList;

public class ReturnKeypad2 {



public static  ArrayList<String> ReturnKeypad(String str,int n)
{

if(n<0)
{
ArrayList<String>ans=new ArrayList<>();
ans.add("");
    return ans;
}
ArrayList<String>ans=ReturnKeypad(str,n-1);
String value=helper(str.charAt(n)-'0');
{int i=0;
    ArrayList<String>newarr=new ArrayList<>();
while(i<ans.size())
{int j=0;
    while(j<value.length())
    {
    newarr.add(ans.get(i)+value.charAt(j));
    j++;
}
i++;
}
return newarr;

}

}
public static String helper(int n)
{
    if(n==0||n==1)
    {
        return " ";
    }
if(n==2)
{
    return "abc";
}
if(n==3)
{
    return "def";
}
if(n==4)
{
 return "ghi";
}
if(n==5)
{
    return "jkl";
}
if(n==6)
{
    return "mno";
}
if(n==7)
{
    return "pqrs";
}
if(n==8)
{
    return "tuv";
}
else
{
    return "wxyz";
}



}
    public static void main(String[]args)
    {
       
        String str ="354";
        ArrayList<String>ans=ReturnKeypad(str,str.length()-1);
        int i=0;
        while(i<ans.size())
        {
System.out.println(ans.get(i));
i++;
        }


       }
      

       }
     
