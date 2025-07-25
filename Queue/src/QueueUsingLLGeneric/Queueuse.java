package QueueUsingLLGeneric;

public class Queueuse {

public static void main(String[]args)
{
    QueueUsingLL<Integer>q1=new QueueUsingLL<>();
    int i=0;
    while(i<15)
    {
    q1.Enqueue(i);
    i++;
    }
    try {
        while(!q1.isempty())
        {
            System.out.println(q1.dequeue());
        }
    } catch (Exception e) {
        // TODO: handle exception

        System.out.println("queue is empty");
        return;
    }
}


}
