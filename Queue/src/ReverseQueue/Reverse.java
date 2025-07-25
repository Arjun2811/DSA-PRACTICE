package ReverseQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse {


    public static void  Reverse(Queue<Integer>q1)
    {
 Queue<Integer>q2=new LinkedList<>();
 Queue<Integer>q3=new LinkedList<>();
 while(q1.size()>1)
 {
q2.add(q1.remove());

 }
 while(!q2.isEmpty()||!q3.isEmpty())
 {
if(!q2.isEmpty())
{
    while(q2.size()>1)
    {
        q3.add(q2.remove());
    }
    q1.add(q2.remove());
}
if(!q3.isEmpty())
{
    while(q3.size()>1)
    {

        q2.add(q3.remove());

    }
    q1.add(q3.remove());

 }
}
    }
    



    public static void main(String[]args)
    {
        Queue<Integer> q1= new LinkedList<>();
        int i=0;
        while(i<10)
        {
            q1.add(i);
            i++;
        }
        Reverse(q1);
        while(!q1.isEmpty())
        {
            System.out.println(q1.remove());
        }
    }
}
