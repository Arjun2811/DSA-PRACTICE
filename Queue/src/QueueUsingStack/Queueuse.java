package QueueUsingStack;

public class Queueuse {


    public static void main(String[]args)
    {
        QueueUsingStack<Integer>q1=new QueueUsingStack<>();
        int i=0;
        while(i<15)
        {
            q1.Enqueue(i);
            i++;
        }
        while(!q1.isempty())
        {
            try {
                System.out.println(q1.dequeue());
            } catch (QueueEmptyException e) {
                
                System.out.println("queue is empty");
            }
        }

    }
}
