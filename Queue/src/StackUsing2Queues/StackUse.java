package StackUsing2Queues;
public class StackUse {




    public static void main(String[]args)
    {
        StackUsing2Queues s1=new StackUsing2Queues();
        int i=0;
        while(i<15)
        {
            s1.push(i);
            i++;
        }
        System.out.println("the top element is "+ s1.top());
        while(!s1.isempty())
        {
            System.out.println(s1.pop());
        }
        System.out.println("the size is "+ s1.Size());
    }
}
