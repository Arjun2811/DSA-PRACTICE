package Practice;
import java.util.Scanner;
public class Nodeuse {




public static Node<Integer> Swap(Node<Integer>head ,int pos1,int pos2)
{
    if(pos1==pos2)
    {
        return head;
    }


int i=0;
Node<Integer>FNode=null;
Node<Integer>SNode=null;
Node<Integer>FNodeprev=null;

Node<Integer>SNodeprev=null;

Node<Integer>temp=head;
while(temp!=null)
{
    if(i==pos1-1)
    {
FNodeprev=temp;
    }

    if(i==pos1)
    {
   FNode=temp;
    }
    if(i==pos2)
    {
   SNode=temp;
    }
    if(i==pos2-1)
    {
   SNodeprev=temp;
    }

    temp=temp.next;
    i++;
}

if(FNode==SNodeprev)
{
    if(FNodeprev==null)
    {
        temp=SNode.next;
        SNode.next=FNode;
        FNode.next=temp;
        return SNode;
    }
FNodeprev.next=SNode;
temp=SNode.next;
SNode.next=FNode;
FNode.next=temp;
return head;
}
if(FNodeprev==null)
{
    temp=FNode.next;
    Node<Integer>temp2=SNode.next;
    head=SNode;
    head.next=temp;
    SNodeprev.next=FNode;
    FNode.next=temp2;
    return head;
}

FNodeprev.next=SNode;
SNodeprev.next=FNode;
temp=SNode.next;
SNode.next=FNode.next;
FNode.next=temp;

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
                
      
                    Node<Integer>finalhead=  Swap(head,0,4);
                  print(finalhead);
                }
}
            
            
            