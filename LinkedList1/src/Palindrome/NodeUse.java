package Palindrome;

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
}

public static boolean Palindrome(Node<Integer>head)
{
    if(head==null)
    {
        return true;
    }
Node<Integer>temp=head;
int count=0;
while(temp!=null)
{
    temp=temp.next;
    count++;
}
temp=head;
int i=0;
while(i<count/2)
{
    temp=temp.next;
    i++;
}
Node<Integer>prev=temp;

Node<Integer>current=temp.next;
temp.next=null;
Node<Integer>next=null;
while(current!=null)
{
 next=current.next;
 current.next=prev;
 prev=current;
 current=next;
}
Node<Integer>Newhead=prev;
i=0;
while(i<count/2&&Newhead!=null)
{
if(head.data!=Newhead.data)
{
    return false;
}
i++;
head=head.next;
Newhead=Newhead.next;
}
return true;
}




public static void main(String[]args)
{

    Node<Integer>head=Takeinput();
    // print(head);
    boolean ans=Palindrome(head);
    System.out.println(ans);
}

}
