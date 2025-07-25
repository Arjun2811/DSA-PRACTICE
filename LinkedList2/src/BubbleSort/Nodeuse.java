package BubbleSort;
import java.util.Scanner;
public class Nodeuse {



public static void BubbleSort(Node<Integer>head)
{
Node<Integer>temp=head;
Node<Integer>temp2=head;
int count=0;
while(temp!=null)
{
    temp=temp.next;
    count++;
}

int f=0;
int count2=count;
while(f<count2-1)
{int i=0;
    temp2=head;
while(i<count-1)
{

    if(temp2.data>temp2.next.data)
    {
int v1=temp2.data;
temp2.data=temp2.next.data;
temp2.next.data=v1;
    }
  temp2=temp2.next;
  i++;
}
count--;
f++;
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
        

BubbleSort(head);

          print(head);
        }
    
    }
    

    
    
    
       
            
               