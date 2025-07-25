package BalancedParanthesis;

public class BalancedParanthesis {


public static void main(String[]args)
{


boolean ans=helper();
System.out.println(ans);

}



public static boolean helper()
{

    StackUsingLL s1=new StackUsingLL();
    String str="])[]({[}[]]((}))[]}}{)]]}{))}[](]{)}(}{{{([(([][([)";
    int i=0;
    while(i<str.length())
    {
    if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='(')
    {
s1.push(str.charAt(i));
i++;
    }
    else if(str.charAt(i)=='}')
    {
        if(s1.top()=='{')
        {
            s1.pop();
            i++;
        }
        else{
            return false;
        }
       
    }
    else if(str.charAt(i)==']')
    {
        if(s1.top()=='[')
        {
            s1.pop();
            i++;
        }
        else{
            return false;
        }
    }
    else if(str.charAt(i)==')')
    {

        if(s1.top()=='(')
        {
            s1.pop();
            i++;
        }
        else
        {
            return false;
        }
    }
    else{
        i++;
    }
}
return true;

}
}
