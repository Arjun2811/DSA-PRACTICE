package QueueUsingLLGeneric;



public class QueueUsingLL<T> {


Node<T>front;
Node<T>rear;
int size;

public QueueUsingLL()
{
    front=null;
    rear=null;
    size=0;

}
public int size()
{
    return size;
}
public boolean isempty()
{
    return size==0;
}
public T front()throws QueueEmptyException
{
 if(size==0)
 {
    throw new QueueEmptyException();
 }
    return front.data;
}
public void Enqueue(T data)
{Node<T>newnode=new Node<T>(data);
    if(size==0)
    {
        front=newnode;
        rear=newnode;
    }
    else{
        rear.next=newnode;
        rear=rear.next;
    }
    size++;
}
public T dequeue() throws QueueEmptyException
{
    if(size()==0)
    {
        throw new QueueEmptyException();
    }
T ele=front.data;
front=front.next;
size--;
if(size==0)
{
rear=null;
}

    return ele;
}



}
