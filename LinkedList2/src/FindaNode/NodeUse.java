package FindaNode;
import java.util.Scanner;
public class NodeUse {



public static int Find(Node<Integer>head,int x,int i)
{

if(head==null)
{
    return -1;
}






   int pos=Find(head.next,x,i+1);

   if(pos!=-1)
   {
    return pos;
   }
   if(head.data==x)
   {
    return i ;
   }
   else{
    return -1;
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
                    Node<Integer>head=takeinput();
                
    int pos= Find(head,5,0);
    System.out.println(pos);

                //   print(finalhead);
                }
            
            }
            
