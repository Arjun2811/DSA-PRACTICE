package Practice;

import java.util.Stack;

public class StackUse {

public static boolean Redundant(String str)
{
Stack<Character>s1=new Stack<>();
    int i=0;
    while(i<str.length())
    {


if(str.charAt(i)!=')')
{
    s1.push(str.charAt(i));
}
else{
    int count=0;
    while(s1.peek()!='(')
    {

if(s1.peek()=='+'||s1.peek()=='-'||s1.peek()=='*'||s1.peek()=='/')
{
    count++;
}


        s1.pop();
    }
    if(count==0)
    {
        return true;
    }
    else{
        s1.pop();
    }
    
}


        i++;
    }
    return false;

}

    public static void main(String[]args)
    {
        String str="a+(b)+c";
        boolean ans=Redundant(str);
        System.out.println(ans);
    }
}
