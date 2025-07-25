package PrintKeypad;

public class Printkeypad {

//23
public static void keypad(int n,String output)
{
    if(n==0)
    {
        System.out.println(output);
        return;
    }


String str=helper(n%10);

if(str.length()==4)
{
    keypad(n/10,str.charAt(0)+output);
    keypad(n/10,str.charAt(1)+output);
    keypad(n/10,str.charAt(2)+output);
    keypad(n/10,str.charAt(3)+output);
}
else{
    keypad(n/10,str.charAt(0)+output);
    keypad(n/10,str.charAt(1)+output);
    keypad(n/10,str.charAt(2)+output);
}
   

    
}

    public static void main(String[]args)
    {
        int n=23;
        keypad(n,"");
    }
    public static String helper(int n)
{
    if(n==0||n==1)
    {
        return "";
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



}
