package QueueUsingStack;

import java.util.Stack;

public class QueueUsingStack<T> {


    Stack<T>s1;
    Stack<T>s2;


public QueueUsingStack()
{

    s1=new Stack<>();
    s2=new Stack<>();
}
public int size()
{
    return s1.size();
}
public boolean isempty()
{
    return size()==0;
}
public T front() throws QueueEmptyException
{
if(s1.size()==0)
{
    throw new QueueEmptyException();
}
while(s1.size()!=1)
{
    s2.push(s1.pop());
}
T ele=s1.peek();
while(!s2.isEmpty())
{
    s1.push(s2.pop());
}
return ele;

}
public void Enqueue(T ele)
{
    s1.push(ele);
}
public T dequeue() throws QueueEmptyException
{
    if(s1.size()==0)
    {
        throw  new QueueEmptyException();
    }
    while(s1.size()!=1)
    {
        s2.push(s1.pop());

    }
    T ele=s1.pop();
    while(!s2.isEmpty())
    {
       s1.push(s2.pop());
    }
    return ele;
}




}
