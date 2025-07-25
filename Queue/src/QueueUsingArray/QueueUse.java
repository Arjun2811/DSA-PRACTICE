package QueueUsingArray;

public class QueueUse {




public static void main(String[]args) throws QueueFullException, QueueEmptyException
{
    QueueusingArray queue=new QueueusingArray();
    int i=0;
    while(i<5)
    {
        queue.enqueue(i);
        i++;
    }
queue.dequeue();
queue.dequeue();
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(10);
queue.enqueue(20);
queue.dequeue();
queue.dequeue();

    while(!queue.isempty())
    {

System.out.println(queue.dequeue());
    }



}
}
