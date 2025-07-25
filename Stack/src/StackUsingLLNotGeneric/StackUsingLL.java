package StackUsingLLNotGeneric;

public class StackUsingLL {


    private Node head;
    private int size;

    public StackUsingLL()
    {
        head=null;
        size=0;
    }

    public int size()
    {
        return size;
    }
    public int top()throws StackEmptyException
    {
        if(head==null)
        {
            throw new StackEmptyException();
        }
        return head.data;
    }
    public void push(int ele)
    {
Node node1=new Node(ele);
node1.next=head;
head=node1;
size++;
    }
public int pop() throws StackEmptyException
{
if(size==0)
{
    throw new StackEmptyException();
}
int ele=head.data;
head=head.next;
size--;
return ele;
    }
public boolean isempty()
{
if(size==0)
{
    return true;
}
else{
    return false;
}
    }
}
