package DeleteEveryNnodes;
import java.util.Scanner;
public class Nodeuse {




public static Node<Integer> Delete(Node<Integer>head,int m ,int n)
{
Node<Integer>temp=head;
Node<Integer>curr=head;
int countM=1;
int countN=0;


if(m==0&&n==0)
{
    return head;
}
if(n==0)
{
    return head;
}
if(head==null)
{
    return head;
}
if(m==0&&n>=1)
{
    return null;
}

while(curr!=null)
{
    while(countM<m&&curr!=null)
    {
        curr=curr.next;
        countM++;
    }
    if(curr==null)
    {
        return head;
    }
    Node<Integer>T=curr.next;
    while(countN<n&&T!=null)
    {
T=T.next;
countN++;
    }
    curr.next=T;
    curr=curr.next;
    countM=1;
    countN=0;
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
                    {
                        Node<Integer>head=takeinput();
                    
      Node<Integer>finalhead= Delete(head,2,2);
    
    
                      print(finalhead);
                    }
                }
                
                
                
    