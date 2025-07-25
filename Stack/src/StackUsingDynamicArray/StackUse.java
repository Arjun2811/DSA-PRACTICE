package StackUsingDynamicArray;
public class StackUse {
public static void main(String[] args) {



StackusingArray s1=new StackusingArray();
int i=0;
while(i<15)
{
    s1.push(i);
    i++;
}

    try {
        while(!s1.isempty())
{
        System.out.println(s1.pop());
    } }catch (StackEmptyException e) {
       
        System.out.println("stack is empty");
        return;
    }
}

    
}






