package Practice;
import java.util.Scanner;
public class NodeUse {



public static Node<Integer> EliminateDuplicates(Node<Integer>head)
{
    if(head==null||head.next==null)
    {
        return head;
    }
Node<Integer>current=head;
Node<Integer>finalhead=null;
Node<Integer>finaltail=null;
while(current.next!=null)
{
    if(current.data==current.next.data)
    {
current=current.next;


    }
    else{
        if(finalhead==null)
        {
            finalhead=current;
            finaltail=current;
        }
        else{
finaltail.next=current;
finaltail=finaltail.next;
        }
        current=current.next;
    }
}
if(finaltail==null)
{
    finaltail=current;
    finalhead=current;
}
else{
finaltail.next=current;
}
return finalhead;



}




public static Node<Integer> takeinput()
{
    Scanner s = new Scanner(System.in);
    int data=s.nextInt();
    Node<Integer>head=null;
    Node<Integer>tail=null;
    while(data!=-1)
    {

        Node<Integer>newnode=new Node<Integer>(data);
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
       Node<Integer>head= takeinput();
    //    print(head);
       Node<Integer>finalhead=EliminateDuplicates(head);

       print(finalhead);
    }
}
