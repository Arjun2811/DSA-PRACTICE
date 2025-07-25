package TakingLLinputBetterApproach;
import java.util.Scanner;
public class NodeUse {


public static Node<Integer> Takinginput()
{Node<Integer>tail=null;
Node<Integer>head=null;
    Scanner s = new Scanner(System.in);
    int data=s.nextInt();


    while(data!=-1)
    {
Node<Integer>newnode=new Node<>(data);
if(head==null)
{
head=newnode;
tail=newnode;
}
else{

    tail.next=newnode;
    tail=tail.next;
}
        data=s.nextInt();
    }
    return head;
}


    public static void main(String[]args)
    {

Node<Integer>head=Takinginput();
while(head!=null)
{
    System.out.println(head.data);
    head=head.next;
}

    }
}
