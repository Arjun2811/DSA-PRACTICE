package Practice;
import java.util.Scanner;
public class Nodeuse {



public static Node<Integer> Delete(Node<Integer>head,int m,int n)
{
   if(head==null)
   {
    return head;
   }
    if(m==0&&n>0)
    {
return null;
    }
    if(m==0&&n==0)
    {
        return head;
    }
    if(n==0)
    {
        return head;
    }
    Node<Integer>temp=head;
    Node<Integer>temp2=head;
    while(temp!=null)
    {
int i=0;
while(i<m-1&&temp!=null)
{
    i++;
    temp=temp.next;
    temp2=temp2.next;
}
if(temp!=null)
{
temp=temp.next;
    }
int j=0;
while(j<n&&temp!=null)
{
temp=temp.next;
j++;
}
if(temp2!=null)
{
temp2.next=temp;
temp2=temp2.next;
}
    }
    return head;
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
                
               
             Node<Integer>finalhead=Delete(head,2,2);
             print(finalhead);
                }
}
            
            
