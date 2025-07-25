package MidpointofaLL;
import java.util.Scanner;
public class Nodeuse {





public static Node<Integer> Merge(Node<Integer>head1,Node<Integer>head2)
{
  
Node<Integer>t1=head1;
Node<Integer>t2=head2;


while(t1!=null&&t2!=null)
{

    if(t1.data<t2.data)
    {
t1=t1.next
    }
    else{

    }

}



}



    public static Node<Integer> takeinput()
    {Scanner s = new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer>head=null;
        Node<Integer>Tail=null;
        while(data!=-1)
        {
            Node<Integer>node=new Node<Integer>(data);
    
            if(head==null)
            {
                head=node;
                Tail=node;
            }
            else{
           Tail.next=node;
           Tail=Tail.next;
    
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
            Node<Integer>head1=takeinput();
            Node<Integer>head2=takeinput();
    Merge(head1,head2);
    
          
        //   print(newhead);
        }
    
    }
    