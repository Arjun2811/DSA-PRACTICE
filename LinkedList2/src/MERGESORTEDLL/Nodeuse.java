package MERGESORTEDLL;
import java.util.Scanner;
public class Nodeuse {








  public static Node<Integer> MergeSort(Node<Integer>head)
  {
  if(head==null||head.next==null)
  {
      return head;
  }
  
  int count=0;
  Node<Integer>temp=head;
  Node<Integer>temp1=head;
  while(temp!=null)
  {
      count++;
      temp=temp.next;
  }
  int mid=count/2;
  int i=0;
  while(i<mid-1)
  {
  temp1=temp1.next;
  i++;
  }
  Node<Integer>part2head=temp1.next;
  temp1.next=null;
  Node<Integer>part1head=head;
  Node<Integer>part1=MergeSort(part1head);
  Node<Integer>part2=MergeSort(part2head);
  
  Node<Integer>finalhead=Merge(part1,part2);
  return finalhead;
  
  }
  
      public static Node<Integer> Merge(Node<Integer>head1,Node<Integer>head2)
      {
  if(head1==null)
  {
    return head2;
  }
  if(head2==null)
  {
    return head1;
  }
  
        
      Node<Integer>t1=head1;
      Node<Integer>t2=head2;
      Node<Integer>mainhead=null;
      boolean t1ll=false;
      boolean t2ll=false;
    if(t1.data<=t2.data)
    {
    mainhead=t1;
  t1ll=true;
    }
    else{
      mainhead=t2;
      t2ll=true;
    }
    Node<Integer>finalhead=mainhead;
    if(t1ll==true)
    {
    while(mainhead.next!=null&&t2!=null)
    {
  
      if(mainhead.next.data<=t2.data)
      {
          mainhead=mainhead.next;
      }
  else{
      Node<Integer>Next=mainhead.next;
      mainhead.next=t2;
      t2=t2.next;
      mainhead=mainhead.next;
      mainhead.next=Next;
  }
    }
  
    while(t2!=null)
    {
      mainhead.next=t2;
      t2=t2.next;
      mainhead=mainhead.next;
    }
    while(mainhead!=null)
    {
      mainhead=mainhead.next;
    }
  }
  else
  {while(mainhead.next!=null&&t1!=null)
    {
  
      if(mainhead.next.data<=t1.data)
      {
          mainhead=mainhead.next;
      }
  else{
      Node<Integer>Next=mainhead.next;
      mainhead.next=t1;
      t1=t1.next;
      mainhead=mainhead.next;
      mainhead.next=Next;
  }
    }
  
    while(t1!=null)
    {
      mainhead.next=t1;
      t1=t1.next;
      mainhead=mainhead.next;
    }
    while(mainhead!=null)
    {
      mainhead=mainhead.next;
    }
  
  }
      return finalhead;
      
      
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
              
  
                  Node<Integer>finalhead=  MergeSort(head);
                print(finalhead);
              }
          
          }
          