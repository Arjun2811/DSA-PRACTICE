package Practice;

import java.util.Stack;

public class StackUse {

public static boolean Balance(String str)
{
    Stack<Character>s1=new Stack<>();
    int i=0;
    while(i<str.length())
    {
if(str.charAt(i)=='(')
{
    s1.push('(');

}
else{
    if(s1.size()==0)
    {
        return false;
    }
    s1.pop();
}
i++;
}
if(s1.size()>0)
{
    return false;
}
return true;

}

    public static void main(String[]args)
    {
        String str=")()()(";
        boolean ans=Balance(str);
        System.out.println(ans);
    }
}
