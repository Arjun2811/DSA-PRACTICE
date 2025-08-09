package PracticeN;
public class QueueUsingArray {

    int arr[];
    int front;
    int rear;
    int size;



    public QueueUsingArray()
    {
        arr=new int[10];
        front=-1;
        rear=-1;
        size=0;
    }

    public QueueUsingArray(int capacity)
    {
        arr=new int[capacity];
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
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }

        return arr[front];
    }


    public void enqueue(int ele) 
    {
if(size==arr.length)
{
    SizeDouble();
}
if(rear==-1)
{
front=0;
}
       
        rear++;
        if(rear==arr.length)
        {
            rear=0;
        }
        arr[rear]=ele;
        size++;
    }

    public int dequeue() throws QueueEmptyException
    {
        if(size==0)
        {
            throw new QueueEmptyException();
        }

        int ele=arr[front];
        front++;
        size--;
        if(front==arr.length)
        {
            front=0;
        }
        if(size==0)
        {
            front=-1;
            rear=-1;
        }

      return ele;
    }

public  void SizeDouble()
{
    int temp[]=arr;
    arr=new int[temp.length*2];
    int i=front;
int f=0;
    while(i<temp.length)
    {

        arr[f]=temp[i];
        i++;
        f++;
    }
   
    i=0;
    while(i<front){

        arr[f]=temp[i];
        i++;
        f++;

    }
    front=0;
    rear=f-1;

}






}
