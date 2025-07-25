package TakingLLInput;
import java.util.Scanner;
public class Nodeuse {





    public static Node<Integer> Takinginput()
    {
        Node<Integer>head=null;
Scanner s= new Scanner(System.in);
int data=s.nextInt();
while(data!=-1)
{
    Node<Integer>newnode=new Node<>(data);
    if(head==null)
    {
    head=newnode;
    }
    else
    {
        Node<Integer>temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
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
