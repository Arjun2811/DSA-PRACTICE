package InsertNodeinLinkedList;
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

public static Node<Integer> InsertNode(int pos,Node<Integer>head,int value)
{

if(head==null)
{
    Node<Integer>newnode=new Node<Integer>(value);
    head=newnode;
    return head;
}
else if (pos==0)
{ Node<Integer>newnode=new Node<Integer>(value);
    newnode.next=head;
    head=newnode;
    return head;

}
else{
    int i=0;
    Node<Integer>temp=head;
    Node<Integer>temp3=head;
    while(i<pos)
    {
        if(i==pos-1)
        {
         temp3=temp;
        }
temp=temp.next;
i++;
    }

    Node<Integer>newnode=new Node<>(value);
    temp3.next=newnode;
    newnode.next=temp;
return head;
}
}
    public static void main(String[]args)
    {

        Node<Integer>head=Takeinput();
        // print(head);
        Node<Integer>Head=InsertNode(2,head,10);
        print(Head);
    }
}
