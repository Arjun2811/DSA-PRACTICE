package StackUsingLL;

public class StackUse {



public static void main(String[]args) throws StackEmptyException
{
    StackUsingLL<Integer>s1=new StackUsingLL<Integer>();
    int i=0;
    while(i<15)
   {
s1.push(i);
i++;
   }
   System.out.println("top is "+ s1.top());
   System.out.println("size is "+ s1.size());
   try{
  while(!s1.isempty())
   {
    System.out.println(s1.pop());

    System.out.println("size is "+ s1.size());
   }
   
}
    
 catch (Exception e) {
    // TODO: handle exception
    System.out.println("Stack is Empty");
}

}

}
