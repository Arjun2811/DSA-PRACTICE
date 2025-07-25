package ReverseLL2;
import java.util.Scanner;
public class Nodeuse{

   

public static DoubleNode<Integer> LinkedList2Reverse(Node<Integer>head)
{
if(head==null||head.next==null)
{
    DoubleNode<Integer> ans=new DoubleNode<>();
    ans.head=head;
    ans.tail=head;
    return ans;
}








   DoubleNode<Integer>finalvalue= LinkedList2Reverse(head.next);
   finalvalue.tail.next=head;
   finalvalue.tail.next.next=null;
   finalvalue.tail=finalvalue.tail.next;
   return finalvalue;



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
                           
                 DoubleNode<Integer>newhead=LinkedList2Reverse(head);
                    
                          
                          print(newhead.head);
                        }
                    
                    }
                    
