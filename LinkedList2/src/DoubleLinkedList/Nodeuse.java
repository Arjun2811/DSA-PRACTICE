package DoubleLinkedList;
import java.util.Scanner;
public class Nodeuse {

public static Node<Integer> takeinput()
{

Scanner s = new Scanner(System.in);

int data=s.nextInt();
Node<Integer>head=null;
Node<Integer>tail=null;

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
public static Node<Integer> Insertion(Node<Integer>Head,int data)
{
    if(Head==null)
    {
        Node<Integer>newnode= new Node<>(data);
        return newnode;
    }

Node<Integer>newnode= new Node<>(data);
newnode.next=Head;
newnode.prev=null;
Head.prev=newnode;


return newnode;

}
public static Node<Integer> Deletion(Node<Integer>head)
{
if(head==null||head.next==null)
{
    return null;
}

    Node<Integer>finalhead=head.next;
   head.next=null;
 finalhead.prev=null;
 return finalhead;
}




    public static void main(String[]args)
    {
        Node<Integer>head=takeinput();
        // print(head);
        Node<Integer>Insertionhead=Insertion(head,5);
        print(Insertionhead);
        // Node<Integer>deletionhead=Deletion(head);
        // print(deletionhead);
    }
}
