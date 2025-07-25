package FindANode;

import java.util.Scanner;

public class NodeUse {


public static Node<Integer> Takeinput()
    {Node<Integer>head=null;
        Node<Integer>tail=null;
Scanner s = new Scanner(System.in);
int data=s.nextInt();

while(data!=-1)
{Node<Integer>newnode=new Node<Integer>(data);
    if(head==null)
    {
    head=newnode;
    tail=newnode;
    }
else{

tail.next=newnode;
tail=newnode;

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
public static int find(Node<Integer>head,int n)
{int i=0;
while(head!=null)
{

if(head.data==n)
{
    return i;
}

i++;
    head=head.next;
}
return -1;


}


    public static void main(String[] args) {
        Node<Integer>head=Takeinput();
        // print(head);
        int n=find(head,5);
        System.out.println(n);

    }
}
