package QueueUsingCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Queueuse {



    public static void main(String[]args)
    {
        Queue<Integer>q1=new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(40);
        q1.add(50);
        System.out.println(q1.peek());
        while(!q1.isEmpty())
        {
            System.out.println(q1.poll());
        }

    }
}
