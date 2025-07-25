package StackUsingArray;

public class StackUse {


public static void main(String[]args)
{
    StackusingArray s1=new StackusingArray();
    
 

    try {
        int i=0;
while(i<11)
{
 s1.push(i);
 i++;
}

    } catch (StackFullException e) {
        // TODO Auto-generated catch block
      System.out.println("Stack is Full");
    }
    


        try {
            while(s1.isempty()==false)
    {
            System.out.println(s1.pop());
    }
        } catch (StackEmptyException e) {
         System.out.println("Stack is Empty");
        }
    }
}
