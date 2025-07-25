package StackUsing2Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

    Queue<Integer>q1;
    Queue<Integer>q2;




    public StackUsing2Queues()
    {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    public int Size()
    {
        return q1.size()+q2.size();
    }
    public boolean isempty()
    {
        return Size()==0;
    }
    public void push(int element)
    {
        if(Size()==0)
        {
            q1.add(element);
        }
        else{
            if(!q1.isEmpty())
            {
                q1.add(element);
            }
            else{
                q2.add(element);
            }
        }
    }
public int pop()
{
while(!q1.isEmpty())
{
if(q1.size()==1)
{
    int a =q1.remove();
    return a;
}
  else{ 
    q2.add(q1.remove());
  }
}
while(!q2.isEmpty())
{
if(q2.size()==1)
{
    int a =q2.remove();
    return a;
}
  else{ 
    q1.add(q2.remove());
  }
}
return -1;
    }

public int top()
{

    while(!q1.isEmpty())
    {
     
        if(q1.size()==1)
        {
            int a=q1.remove();
            q2.add(a);
            return a;
        }

else
{
        q2.add(q1.remove());
    }
    }
    while(!q2.isEmpty())
    {
     
        if(q2.size()==1)
        {
            int a=q2.remove();
            q1.add(a);
            return a;
        }

else
{
        q1.add(q2.remove());
    }
    }
return -1;
}
}
