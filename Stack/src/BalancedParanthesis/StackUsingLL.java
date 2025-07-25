package BalancedParanthesis;

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
    
    public char top() 
    {
        if(size()==0)
        {
          return 'N';
        }
        return head.data;
    }
    public void push( char ele)
    {
    
    
    Node node1=new Node (ele);
    node1.next=head;
    head=node1;
    size++;
    
    
    
    }
    public char pop() 
    {
        if(size()==0)
        {
           return 'N';
        }
    char ele=head.data;
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
    