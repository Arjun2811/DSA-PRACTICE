package PrintRecuresively;
import java.util.Scanner;
public class Nodeuse{




public static void printRecursive(Node<Integer>Head)
{
if(Head==null)
{
    return;
}


System.out.println(Head.data);
    printRecursive(Head.next);
   
    return;
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
               
        
        printRecursive(head);
              
            //   print(newhead);
            }
        
        }
        