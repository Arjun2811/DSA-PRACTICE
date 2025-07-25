package PrintReverseLinkedList;

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
public static void PrintReverse(Node<Integer>head)
{
if(head==null)
{
    return;
}


PrintReverse(head.next);
System.out.println(head.data);

}

    public static void main(String[]args)
    {
Node<Integer>head=Takeinput();
// print(head);
PrintReverse(head);
    }
}
