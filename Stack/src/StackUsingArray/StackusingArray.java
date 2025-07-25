package StackUsingArray;

public class StackusingArray {

private int data[];
private int top;


public StackusingArray()
{
    data= new int[10];
    top=-1;
}
public StackusingArray(int value)
{
    data=new int[value];
    top=-1;
}

public int size()
{
    return top+1;
}


public  boolean isempty()
{
    if(size()==0)
    {
        return true;
    }
    else{
        return false;
    }
}
public void push(int element) throws StackFullException
{

    if(size()==data.length)
    {
        StackFullException e=new StackFullException();
        throw e;
    }
    top++;
    data[top]=element;
}
public int pop() throws StackEmptyException
{
    if(size()==0)
    {
        StackEmptyException e =new StackEmptyException();
        throw e;
    }
    int element=data[top];
    top--;
    return element;
}
public int top() throws StackEmptyException
{
if(top==-1)
{
    StackEmptyException e=new StackEmptyException();
    throw e;
}


    return data[top];
}


}
