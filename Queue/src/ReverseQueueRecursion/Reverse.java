package ReverseQueueRecursion;
import java.util.LinkedList;
import java.util.Queue;

public class Reverse {

public static void reverse(Queue<Integer>q1)
{
    if(q1.size()==0)
    {
        return;
    }


int a=q1.poll();
    reverse(q1);
    q1.add(a);
    return;

}

public static void main(String[]args)
{
    int i=0;
    Queue<Integer>q1=new LinkedList<>();
    while(i<5)
    {
q1.add(i);
i++;
    }
    reverse(q1);
    while(!q1.isEmpty())
    {
        System.out.println(q1.poll());
    }
}

}

