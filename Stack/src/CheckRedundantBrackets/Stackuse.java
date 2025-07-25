package CheckRedundantBrackets;

public class Stackuse {

public static boolean CheckRedundant(String str)
{
StackUsingLL s1=new StackUsingLL();

int i=0;

while(i<str.length())
{

    if(str.charAt(i)==')')
    {i++;

int count=0;
while(s1.top()!='(')
{
    if(s1.top()=='+'||s1.top()=='-'||s1.top()=='*'||s1.top()=='/')
{

    count++;
    
}
s1.pop();


    }
    if(count==0)
    {
return true;
    }
    s1.pop();
    }
    else{

        s1.push(str.charAt(i));
        i++;
    }
}
return false;

}

public static void main(String[]args)
{
    String str="a+(b)+c ";
    boolean ans=CheckRedundant(str);
    System.out.println(ans);
}


}
