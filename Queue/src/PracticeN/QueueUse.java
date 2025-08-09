package PracticeN;

public class QueueUse {



    public static void main(String[]args)throws QueueEmptyException
    {
        QueueUsingArray q1=new QueueUsingArray();
        int i=0;
        while(i<14)
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
