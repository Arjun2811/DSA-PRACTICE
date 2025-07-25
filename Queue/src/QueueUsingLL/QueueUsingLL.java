package QueueUsingLL;

public class QueueUsingLL {


    Node front;
    Node rear;
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
    public int front()throws QueueEmptyException
    {
     if(size==0)
     {
        throw new QueueEmptyException();
     }
        return front.data;
    }
    public void Enqueue(int data)
    {Node newnode=new Node(data);
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
    public int dequeue() throws QueueEmptyException
    {
        if(size()==0)
        {
            throw new QueueEmptyException();
        }
    int ele=front.data;
    front=front.next;
    size--;
    if(size==0)
    {
    rear=null;
    }
    
        return ele;
    }
    
    
    
    }
    