package BalanceBracket;

import java.util.Stack;

public class Balance {




    public static int Balance(String str)
    {
        Stack<Character>s1=new Stack<>();
        if(str.length()%2!=0)
        {
return -1;
        }
      
        int i=0;
 while(i<str.length())
        {
if(str.charAt(i)=='{')
{
s1.addElement('{');
    
}
else{
    if(str.charAt(i)=='}')
    {
        if(!s1.empty()&&s1.peek()=='{')
        {
            s1.pop();
        }
        else{
            s1.add('}');
        }

    }
  
}
i++;
        
    }
    int count=0;
    while(!s1.isEmpty())
    {
        if(s1.pop()==s1.pop())
        {
count++;
        }
        else{
            count+=2;
        }
    }
    return count;
}



    public static void main(String[]args)
    {
        String str="{{{{}}";
        int ans=Balance(str);
        System.out.println(ans);
    }
}
