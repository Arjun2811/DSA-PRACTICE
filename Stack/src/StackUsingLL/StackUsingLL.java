package StackUsingLL;

public class StackUsingLL<T> {

private Node<T>head;

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

public T top() throws StackEmptyException
{
    if(size()==0)
    {
        StackEmptyException e =new StackEmptyException();
        throw e;
    }
    return head.data;
}
public void push(T ele)
{


Node<T>node1=new Node<T>(ele);
node1.next=head;
head=node1;
size++;



}
public T pop() throws StackEmptyException
{
    if(size()==0)
    {
        StackEmptyException e =new StackEmptyException();
        throw e;
    }
T ele=head.data;
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
