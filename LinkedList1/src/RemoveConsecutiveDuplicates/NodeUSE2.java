package RemoveConsecutiveDuplicates;
import java.util.Scanner;
public class NodeUSE2{


public static Node<Integer> takingLLinputbetter()
{Scanner s = new Scanner(System.in);
    Node<Integer>head=null;
    Node<Integer>tail=null;
    int data=s.nextInt();
    while(data!=-1)
    {
Node<Integer>node1=new Node<Integer>(data);
if(head==null)
{
    head=node1;
    tail=node1;
}
else{
    tail.next=node1;
tail=node1;
}
data=s.nextInt();

    }
    return head;
}

public static Node<Integer> RemoveDuplicates(Node<Integer>head)
{
if(head==null||head.next==null)
{
    return head;
}


Node<Integer>Head2=head;
Node<Integer>tail=head;

while(tail.next!=null)
{
    if(tail.next!=null&&tail.data==tail.next.data)
    {
        tail=tail.next;
    }
    else if(tail.next!=null&&tail.data!=tail.next.data)
    {tail=tail.next;
    Head2.next=tail;
    Head2=Head2.next;
    
   }
  
}
Head2.next=null;
return head;




}
    public static void main(String[] args) {

Node<Integer>head=takingLLinputbetter();
Node<Integer>Head=RemoveDuplicates(head);
while(Head!=null)
{
    System.out.println(Head.data);
    Head=Head.next;
}

}


}


    
