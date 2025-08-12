package Practice;

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
  public void enqueue(T data)
  {
    Node<T>node1=new Node<>(data);
    if(size==0)
    {
        front=node1;
        rear=node1;
        size++;
    }
    else{

        rear.next=node1;
        rear=rear.next;
        size++;

    }

  }
  public T dequeue() throws QueueEmptyException
  {

    if(size==0)
    {
        QueueEmptyException e = new QueueEmptyException();
        throw e;
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
  public T front() throws QueueEmptyException
  {
    if(size==0)
    {
        QueueEmptyException e= new QueueEmptyException();
        throw e;
    }
    return front.data;
  }
}
