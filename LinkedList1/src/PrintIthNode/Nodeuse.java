package PrintIthNode;

import java.util.Scanner;

public class Nodeuse {

public static void PrintIth(int i,Node<Integer>head)
{

    int f=0;
    while(f<i)
    {
        if(head.next==null)
        {System.out.println("-1");
            return;
        }

        head=head.next;
        f++;
    }

    System.out.println(head.data);





}

public static Node<Integer> Takinginput()
{Node<Integer>tail=null;
Node<Integer>head=null;
    Scanner s = new Scanner(System.in);
    int data=s.nextInt();


    while(data!=-1)
    {
Node<Integer>newnode=new Node<>(data);
if(head==null)
{
head=newnode;
tail=newnode;
}
else{

    tail.next=newnode;
    tail=tail.next;
}
        data=s.nextInt();
    }
    return head;
}

public static void main(String[]args)
{
Node<Integer>head=Takinginput();
    PrintIth(0,head);
}

}
