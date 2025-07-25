package EvenafterOdd;
import java.util.Scanner;
public class Nodeuse {

public static Node<Integer> EvenAfterodd(Node<Integer>head)
{

Node<Integer>oddhead=null;
Node<Integer>oddtail=null;
Node<Integer>evenhead=null;
Node<Integer>eventail=null;



Node<Integer>temp=head;
while(temp!=null)
{
if(temp.data%2==0)
{
if(evenhead==null)
{
    evenhead=temp;
    eventail=temp;
}
else{
    eventail.next=temp;
    eventail=eventail.next;
}
}
else{
if(oddhead==null)
{  
    oddhead=temp;
    oddtail=temp;
}
else{
    oddtail.next=temp;
    oddtail=oddtail.next;
}
}
    temp=temp.next;
}
if(oddtail==null)
{
    return evenhead;
}
if(eventail.next!=null)
{
    eventail.next=null;
}
if(oddtail.next!=null)
{
    oddtail.next=null;
}
oddtail.next=evenhead;
return oddhead;




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
                
Node<Integer>finalhead=EvenAfterodd(head);
  

                  print(finalhead);
                }
            
            }
            
