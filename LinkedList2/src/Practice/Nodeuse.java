package Practice;
import java.util.Scanner;
public class Nodeuse {


public static Node<Integer> Kreverse(Node<Integer>head,int k)
{
Node<Integer>current=head;
Node<Integer>prev=null;
Node<Integer>next=null;
Node<Integer>prevhead=null;
Node<Integer>finalhead=null;

while(current!=null)
{
int i=1;

while(i<=k&&current!=null)
{
    if(prev!=null&&prevhead==null)
    {
prevhead=prev;
    }

next=current.next;
current.next=prev;
prev=current;
current=next;
i++;
}
if(finalhead==null)
{
    finalhead=prev;
}

if(prevhead!=null)
{
prevhead.next=prev;
}

}
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
                {Scanner s = new Scanner(System.in);
                    Node<Integer>head=takeinput();
                
               
             Node<Integer>finalhead=Kreverse(head,2);
             print(finalhead);
                }
}
            
            
