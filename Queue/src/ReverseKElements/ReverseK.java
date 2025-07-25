package ReverseKElements;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseK {








public static Queue<Integer> ReverseK(Queue<Integer>q1,int k)
{
    if(k>q1.size())
    {
        return q1;
    }
Queue<Integer>q2=new LinkedList<>();
int i=0;
while(i<k)
{
q2.add(q1.remove());
i++;
}
Reverse(q2);
while(!q1.isEmpty())
{
    q2.add(q1.remove());
}

return q2;
}

public static void Reverse(Queue<Integer>q2)
{

if(q2.size()==0)
{
    return;
}



int a=q2.poll();
    Reverse(q2);
    q2.add(a);
    return;

}

    


    public static void main(String[]args)
    {
        Queue<Integer>q1=new LinkedList<>();
        int i=0;
        while(i<8)
        {
           q1.add(i);
           i++;

        }
        Queue<Integer>q2=ReverseK(q1,0);
        while(!q2.isEmpty())
        {
            System.out.println(q2.poll());
        }
    }
}
