package DyanamicQueue;

public class QueueUse {



    public static void main(String[]args) throws QueueEmptyException
    {
        QueueUsingDynamicArray queue=new QueueUsingDynamicArray(3);
        int i=0;
        while(i<10)
        {
            queue.Enqueue(i);
            i++;
        }
        while(!queue.isempty())
        {
             System.out.println(queue.dequeue());
        }
    }
}
