package ReverseIterative;
import java.util.Scanner;
public class Nodeuse{

    
public static Node<Integer> Reverse(Node<Integer>head)
{

if(head==null||head.next==null)
{
    return head;
}


Node<Integer>current=head;
Node<Integer>prev=null;
Node<Integer>Next=null;
while(current!=null)
{
    Next=current.next;
    current.next=prev;
    prev=current;
    current=Next;
}
return prev;

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
                        Node<Integer>head=takeinput();
                       
                
                Node<Integer>newhead=Reverse(head);
                      
                      print(newhead);
                    }
                
                }
                