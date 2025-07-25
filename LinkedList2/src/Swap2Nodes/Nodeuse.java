package Swap2Nodes;
import java.util.Scanner;
public class Nodeuse {
 




public static Node<Integer> Swap(Node<Integer>head,int i ,int j)
{
    if(i==j)
    {
        return head;
    }

Node<Integer>FVal=null;
Node<Integer>SVal=null;
Node<Integer>FValP=null;
Node<Integer>SValP=null;

Node<Integer>temp=head;
int x=0;
while(temp!=null)
{

if(x==i-1)
{
    FValP=temp;
}
if(x==i)
{
    FVal=temp;
}
if(x==j)
{
    SVal=temp;
}
if(x==j-1)
{
    SValP=temp;
}


    temp=temp.next;
    x++;
}


if(FValP==null)
{
    SValP.next=FVal;
    head=SVal;
    Node<Integer>SvalNT=SVal.next;
    SVal.next=FVal.next;
    FVal.next=SvalNT;
    return head;
}
if(FValP==null&&FVal==SValP)
{

    head=SVal;
    Node<Integer>Temp=SVal.next;
    SVal.next=FVal;
    FVal.next=temp;
    return head;
}

if(FVal==SValP)
{
    FValP.next=SVal;
    Node<Integer>Stemp=SVal.next;
    SVal.next=FVal;
    FVal.next=Stemp;
return head;
}



SValP.next=FVal;
FValP.next=SVal;
Node<Integer>SValNextT=SVal.next;
SVal.next=FVal.next;
FVal.next=SValNextT;


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
        {
            Node<Integer>head=takeinput();
        
Node<Integer>finalhead=Swap(head,0,1);

          print(finalhead);
        }
    
    }
