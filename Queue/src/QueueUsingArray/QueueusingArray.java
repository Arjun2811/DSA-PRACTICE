package QueueUsingArray;

public class QueueusingArray {

int data[];
int front;
int rear;
int size;

public QueueusingArray()
{
    data=new int[10];
    front=-1;
    rear=-1;
    size=0;

}
public QueueusingArray(int capacity)
{
    data=new int[capacity];
    front=-1;
    rear=-1;
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
public int front() throws QueueEmptyException
{
if(size()==0)
{
    QueueEmptyException e=new QueueEmptyException();
    throw e;
}

return data[front];

}
public void enqueue(int element)throws QueueFullException
{
    if(size==data.length)
    {
        QueueFullException e =new QueueFullException();
        throw e;
    }


if(size()==0)
{
front=0;
}
if(rear+1==data.length)
{
    rear=-1;
}

rear++;
data[rear]=element;
size++;


}
public int dequeue() throws QueueEmptyException
{

if(size()==0)
{

    throw new QueueEmptyException();
}

    int temp=data[front];

    size--;
    if(size==0)
    {
        front=-1;
        rear=-1;
    }
    if(front+1==data.length)
    {
        front=-1;
    }
    front++;
    return temp;
 
}


  
}
