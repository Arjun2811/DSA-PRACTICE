package ReverseLinkedListRecursion;
import java.util.Scanner;
public class NodeUse{

   


public static Node<Integer> LinkedListReverse(Node<Integer>head)
{
if(head==null||head.next==null)
{
    return head;
}


    Node<Integer>finalhead=LinkedListReverse(head.next);
    Node<Integer>temp=finalhead;
    while(temp.next!=null)
    {
temp=temp.next;
    }
    temp.next=head;
    head.next=null;
    return finalhead;
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
                       
             Node<Integer>newhead=LinkedListReverse(head);
                
                      
                      print(newhead);
                    }
                
                }
                