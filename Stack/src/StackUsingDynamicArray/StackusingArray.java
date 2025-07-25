package StackUsingDynamicArray;

public class StackusingArray {


    private int data[];
    private int top;


    public StackusingArray()
    {
        data=new int[10];
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
public boolean isempty()
{
    if(size()==0)
    {
        return true;
    }
    else{
        return false;
    }
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
public void push(int ele)
{
if(size()==data.length)
{
doublecapacity();
}


    top++;
    data[top]=ele;

}
public int pop()throws StackEmptyException
{

if(size()==0) 
{
    StackEmptyException e =new StackEmptyException();
    throw e;
}



int ele=data[top];
top--;
return ele;


}
public void doublecapacity()
{
    int temp[]=data;
    data=new int[temp.length*2];
    int i=0;
    while(i<temp.length)
    {
data[i]=temp[i];
i++;
    }
}


}
