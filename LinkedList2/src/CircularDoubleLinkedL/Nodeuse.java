package CircularDoubleLinkedL;
import java.util.Scanner;
public class Nodeuse {

public static Node<Integer> takeinput()
{

Scanner s = new Scanner(System.in);

int data=s.nextInt();
Node<Integer>head=null;
Node<Integer>tail=null;
if(data==-1)
{
    return head;
}
while(data!=-1)
{
    Node<Integer>newnode=new Node<>(data);
if(head==null)
{
    head=newnode;
    tail=newnode;
    tail.prev=null;
}
else{
tail.next=newnode;
newnode.prev=tail;
tail=tail.next;


}

    data=s.nextInt();
}
tail.next=head;
head.prev=tail;
return head;

}

public static void print(Node<Integer>head)
{
    Node<Integer>temp=head;
    if(head==null)
    {
        return;
    }
    System.out.println(temp.data);
    if(head.next==head||head.next==null)
    {
        return;
    }
temp=temp.next;
    while(temp!=head)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
}
public static Node<Integer> Insertion(Node<Integer>head,int data)
{
    if(head==null)
    {
        Node<Integer>newnode= new Node<>(data);
        return newnode;
    }

Node<Integer>newnode=new Node<>(data);
newnode.next=head;
newnode.prev=head.prev;
head.prev=newnode;
newnode.prev.next=newnode;

return newnode;

}
public static Node<Integer> Deletion(Node<Integer>head)
{
if(head==null||head.next==head)
{
    return null;
}

    head.prev.next=head.next;
    head.next.prev=head.prev;
    head=head.next;
    return head;
}




    public static void main(String[]args)
    {
        Node<Integer>head=takeinput();
        // print(head);
        // Node<Integer>Insertionhead=Insertion(head,5);
        // print(Insertionhead);
        Node<Integer>deletionhead=Deletion(head);
        print(deletionhead);
    }
}
