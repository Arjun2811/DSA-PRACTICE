package DyanamicQueue;

public class QueueUsingDynamicArray {

int data[];
int front;
int rear;
int size;

public  QueueUsingDynamicArray()
{
    data=new int[10];
front=-1;
rear=-1;
size=0;
}
public QueueUsingDynamicArray(int capacity)
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
    if(size==0)
    {
        throw new QueueEmptyException();
    }

    return data[front];
}


public void Enqueue(int element)
{

if(size==data.length)
{
    doublecapacity();
}

if(size==0)
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

    if(size==0)
    {
        throw new QueueEmptyException();
    }
    int temp=data[front];
    if(front+1==data.length)
    {
        front=-1;
    }
    front++;
    size--;
    if(size==0)
    {
        front=-1;
        rear=-1;
    }
    return temp;
}

public void doublecapacity()
{
    int temp[]=data;
    data=new int[temp.length*2];
    int i=front;
    int j=0;
    while(i<temp.length)
    {
        data[j]=temp[i];
        i++;
        j++;
    }
     i=0;
     while(i<=front-1)
     {
        data[j]=temp[i];
        i++;
        j++;
     }
     front=0;
     rear=temp.length-1;

}


}
