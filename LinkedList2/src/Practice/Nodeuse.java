package Practice;
import java.util.Scanner;
public class Nodeuse {



public static Node<Integer> Reverse(Node<Integer>head)
{
    Node<Integer>current=head;
    Node<Integer>prev=null;
    Node<Integer>next=null;
    while(current!=null)
    {
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
return prev;
}




public static boolean Palindrome(Node<Integer>head)
{
    if(head==null||head.next==null)
    {
        return true;
    }
Node<Integer>temp=head;
int count=0;
while(temp!=null)
{
    count++;
    temp=temp.next;
}
Node<Integer>temp1=head;
int i=0;
while(i<(count/2)-1)
{
    i++;
    temp1=temp1.next;
}
Node<Integer>part2head=null;

    part2head=Reverse(temp1.next);



    temp1.next=null; 



while(head!=null&&part2head!=null)
{
    if(head.data!=part2head.data)
    {
        return false;
    }
    else{
        head=head.next;
        part2head=part2head.next;
    }
}
return true;









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
                
                //   System.out.println("PLEASE PRINT VALUE OF N");
                //   int n=s.nextInt();
                  boolean ans=Palindrome(head);
                  System.out.println(ans);
                //   print(finalhead);
                }
}
            
            
            