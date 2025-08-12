package Practice;

public class QueueUSE {




    public static void main(String[]args) throws QueueEmptyException
    {
        QueueUsingLL<Integer>q1=new QueueUsingLL<>();
    int i=0;
    while(i<15)
    {
        q1.enqueue(i);
        i++;
    }
    while(!q1.isempty())
    {
        System.out.println(q1.dequeue());
    }
    }
}
