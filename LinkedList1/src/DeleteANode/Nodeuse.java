package DeleteANode;

import java.util.Scanner;

public class Nodeuse {

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
}
public static Node<Integer> Delete(int pos,Node<Integer>head)
{
Node<Integer>temp=head;
int i=0;


if(head==null)
{
    return head;
}

if(pos==0)
{
    head=head.next;
    return head;
}

while(temp!=null)
{

if(i==pos-1&&temp.next!=null)
{

    temp.next=temp.next.next;
    return head;
}



i++;
    temp=temp.next;
}
return head;

   
}




    


    public static void main(String[]args)
    {
Node<Integer>head=Takeinput();
// print(head);
Node<Integer>Head=Delete(2,head);
print(Head);
        
    }
}
