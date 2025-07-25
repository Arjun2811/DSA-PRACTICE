package AppendLastNtoFirst;

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


public static Node<Integer> Appendagain(Node<Integer>head,int n,int length)
{
    if(length<=n||n==0)
    {
        return head;
    }
int i=0;
Node<Integer>temp=head;
while(i<length-n-1)
{
temp=temp.next;
i++;
}
Node<Integer>newhead=temp.next;
temp.next=null;
Node<Integer>temp2=newhead;
while(temp2.next!=null)
{
    temp2=temp2.next;
}
temp2.next=head;

return newhead;
}

public static Node<Integer> Append(Node<Integer>head,int n)
{
   
Node<Integer>temp=head;
int length=0;
while(temp!=null)
{
length++;
    temp=temp.next;
}
return Appendagain(head,n,length);


}
    public static void main(String[] args) {
        Node<Integer>head=Takeinput();
        // print(head);
        Node<Integer>newHead=Append(head,3);
        while(newHead!=null)
        {
            System.out.println(newHead.data);
            newHead=newHead.next;
        }
    }
}
