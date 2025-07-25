package RemoveConsecutiveDuplicates;

import java.util.Scanner;

public class NodeUse {

public static Node<Integer> Takeinput()
    {Node<Integer>head=null;
        Node<Integer>tail=null;
Scanner s = new Scanner(System.in);
int data=s.nextInt();

while(data!=-1)
{Node<Integer>newnode=new Node<Integer>(data);
    if(head==null)
    {
    head=newnode;
    tail=newnode;
    }
else{

tail.next=newnode;
tail=newnode;

}

    data=s.nextInt();
}
return head;


    }
public static void print(Node<Integer>head)
{
    while(head!=null)
    {
        System.out.println(head.data);
        head=head.next;
    }
}///10,20,20,30,10,10
public static void ConsecutiveDuplicates(Node<Integer>head)
{
if(head==null||head.next==null)
{
    return;
}
int i=0;
Node<Integer>temp=head;
while(temp!=null)
{
    if(temp.next!=null)
    {
if(temp.data!=temp.next.data)
{
temp=temp.next;
}
    
else{
    Node<Integer>temp2=temp;
    while(temp.next!=null&&temp.data==temp.next.data)
    {
temp=temp.next;
    }
    temp2.next=temp.next;
    temp=temp.next;
}
    }
    else{
        temp=temp.next;
    }
  
}



}

public static void main(String[]args)
{


    Node<Integer>head=Takeinput();
    // print(head);
    ConsecutiveDuplicates(head);
    while(head!=null)
    {
        System.out.println(head.data);
        head=head.next;
    }
}

}
