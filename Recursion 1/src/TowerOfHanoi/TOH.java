package TowerOfHanoi;

public class TOH {

public static void TOH(int n,char source,char auxilary,char destination)
{
if(n==1)
{
    System.out.println(source+" "+destination);
    return;
}


    TOH(n-1,source,destination,auxilary);

    System.out.println(source+" "+destination);

    TOH(n-1,auxilary,source,destination);

}
    public static void main(String[]args)
    {
        int n=4;
        TOH(n,'a','b','c');
    }
}
