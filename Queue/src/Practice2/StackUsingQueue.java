package Practice2;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {


     Queue<Integer>q1;
    Queue<Integer>q2;

    public StackUsingQueue()
    {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    public int size()
    {
        return q1.size()+q2.size();
    }

public boolean isempty()
{
    return size()==0;
}

public int front()
{
int a=-1;
if(!q1.isEmpty())
{
while(!q1.isEmpty())
{if(q1.size()==1)
    {
         a=q1.peek();
    }

    q2.add(q1.remove());
}
return a;
}
else{
while(!q2.isEmpty())
{if(q2.size()==1)
    {
         a=q2.peek();
    }

    q1.add(q2.remove());
}
}
return a;

    }
    public void push(int ele)
    {
        if(!q1.isEmpty())
        {
         q1.add(ele);
        }
        else if(!q2.isEmpty())
        {

q2.add(ele);

        }
        else{
            q1.add(ele);
        }

    }
    public int pop()
    {
        int a=-1;
        if(!q1.isEmpty())
        {
        while(!q1.isEmpty())
        {if(q1.size()==1)
            {
                 a=q1.remove();
                 return a;
            }
        
            q2.add(q1.remove());
        }
      
        }
        else{
        while(!q2.isEmpty())
        {if(q2.size()==1)
            {
                 a=q2.remove();
                 return a;
            }
        
            q1.add(q2.remove());
        }
        }
        return a;
        
            }

    }

