package Practice2;
import java.util.Scanner;
public class Nodeuse {


   

public static Node<Integer> Swap(Node<Integer>head,int pos1,int pos2)
{
if(head==null||pos1==pos2)
{
    return head;
}

Node<Integer>temphead=head;
Node<Integer>prevfirst=null;
Node<Integer>first=null;
Node<Integer>prevsecond=null;
Node<Integer>second=null;
int i=0;
while(temphead!=null)
{
   
    if(i==pos1-1)
    {
 prevfirst=temphead;
    }
    if(i==pos1)
    {
first=temphead;
    }
    if(i==pos2-1)
    {
prevsecond=temphead;
    }
    if(i==pos2)
    {
 second=temphead;
    }
temphead=temphead.next;
i++;
}

if(prevsecond==first)
{
if(prevfirst==null)
{
    Node<Integer>temp=second.next;
    head=second;
    head.next=first;
    first.next=temp;
    return second;

}
prevfirst.next=second;
Node<Integer>temp=second.next;
second.next=first;
first.next=temp;
return head;
}

if(prevfirst==null)
{
    Node<Integer>temp=second.next;
    Node<Integer>temp2=head.next;
    head=second;
   
    second.next=temp2;
first.next=temp;
prevsecond.next=first;
return head;
}

prevfirst.next=second;
Node<Integer>temp=second.next;
second.next=first.next;
prevsecond.next=first;
first.next=temp;
return head;
}




    public static Node<Integer> takeinput()
    {
        Scanner s = new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer>head=null;
        Node<Integer>tail=null;
        while(data!=-1)
        {Node<Integer>node1=new Node<Integer>(data);
            if(head==null)
            {
            head=node1;
            tail=node1;
        }
        else{
           tail.next=node1;
           tail=tail.next;
        }
        data=s.nextInt();
    }
return head;
    }
public static void print(Node<Integer>head)
{
    Node<Integer>temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
}

    public static void main(String[]args)
    {
       Node<Integer>head= takeinput();
        // print(head);
        Node<Integer>finalhead=Swap(head,1,3);
        print(finalhead);
    }
}
