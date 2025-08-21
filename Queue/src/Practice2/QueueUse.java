package Practice2;

import java.util.Queue;

public class QueueUse {

   public static void main(String[] args) {
    
    StackUsingQueue s1=new StackUsingQueue();
    int i=0;
    while(i<15)
    {
        s1.push(i);
        i++;

    }
    System.out.println("size is"+ s1.size());
    System.out.println("Top is"+s1.front());
    while(!s1.isempty())
    {
        System.out.println(s1.pop());
    }
   }


}
