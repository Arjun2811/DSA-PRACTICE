package QueueUsingLL;

public class QueueUse {



public static void main(String[]args)
{QueueUsingLL q1=new QueueUsingLL();
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
            // TODO Auto-generated catch block
            System.out.println("Queue is empty");
            return;
        }
    }
}

}
