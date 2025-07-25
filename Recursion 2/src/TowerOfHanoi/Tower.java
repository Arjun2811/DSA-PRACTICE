package TowerOfHanoi;

public class Tower {


public static void tower(int n,char source,char auxilary ,char destination )
{
    if(n==0)
    {
        return;
    }
if(n==1)
{
    System.out.println(source+" "+destination);
    return;
}


tower(n-1,source,destination,auxilary);
System.out.println(source+" "+destination);
tower(n-1,auxilary,source,destination);
}

    public static void main(String[]args)
    {
        int n=3;
        tower(n,'a','b','c');
    }
}
