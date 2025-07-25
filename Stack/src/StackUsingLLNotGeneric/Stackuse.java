package StackUsingLLNotGeneric;

public class Stackuse {




    public static void main(String[]args) throws StackEmptyException
    {

        StackUsingLL s1=new StackUsingLL();
        int i=0;
        while(i<15)
        {
            s1.push(i);
            i++;
        }
        System.out.println("size is "+s1.size());
        System.out.println("top is"+s1.top());
        while(!s1.isempty())
        {
System.out.println(s1.pop());

        }
    }
}
