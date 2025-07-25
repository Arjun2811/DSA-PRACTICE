package StackinCollections;
import java.util.Stack;
public class StackinCollections {




public static void main(String[]args)
{
    Stack<Integer>s1=new Stack<>();
    int i=0;
    while(i<15)
    {
        s1.push(i);
        i++;
    }
    System.out.println(s1.search(0));
    System.out.println(s1.peek());
    while(!s1.isEmpty())
    {
        System.out.println(s1.pop());
    }

}


}
