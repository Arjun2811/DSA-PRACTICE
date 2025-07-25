package KReverse;
import java.util.Scanner;
public class NodeUse{



public static Node<Integer> Kreverse(Node<Integer>head,int k)
{

    if (head == null || k <= 1) {
        return head; // No need to reverse if head is null or k is 1 or less
    }

Node<Integer>current=head;
Node<Integer>prevtail=null;
Node<Integer>newhead=null;
Node<Integer>nextnode=current;


while(current!=null)
{
    Node<Integer>groupprev=null;
    Node<Integer>grouphead=current;
int count=0;
while(current!=null&&count<k)
{
nextnode=current.next;
current.next=groupprev;
groupprev=current;
current=nextnode;
count++;
}
if(newhead==null)
{
    newhead=groupprev;
}
if(prevtail!=null)
{
prevtail.next=groupprev;
}

    prevtail=grouphead;


}
return newhead;
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
           
    Node<Integer>newhead=Kreverse(head,2);
    
          
          print(newhead);
        }
    
    }
       
            
            
                