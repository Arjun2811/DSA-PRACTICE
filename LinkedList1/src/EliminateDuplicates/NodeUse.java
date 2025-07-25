package EliminateDuplicates;

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

public static Node<Integer> eliminate(Node<Integer>head)
{
    if(head==null)
{
    return head;
}
if(head.next==null)
{
    return head;
}


Node<Integer>temp=head;
Node<Integer>temp2=head.next;
while(temp2!=null)
{
    if(temp.data.equals(temp2.data))
    {
temp2=temp2.next;
    }
    else{
        temp.next=temp2;
        temp=temp2;
    }

}
temp.next=null;
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
public static void main(String[]args)
{
    Node<Integer>head=Takeinput();
    // print(head);
    Node<Integer>Head=eliminate(head);
     print(Head);
}




}
