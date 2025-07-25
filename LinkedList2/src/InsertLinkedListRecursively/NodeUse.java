package InsertLinkedListRecursively;
import java.util.Scanner;
public class NodeUse{

public static Node<Integer> InsertR(Node<Integer>Head,int ele,int pos)
{
if(pos==0)
{
    Node<Integer>NewElement=new Node<>(ele);
 NewElement.next=Head;
 return NewElement;
}


Node<Integer>NewElement=InsertR(Head.next,ele,pos-1);
Head.next=NewElement;
return Head;
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
                   
            Node<Integer>newhead=InsertR(head,5,0);
            
                  
                  print(newhead);
                }
            
            }
            