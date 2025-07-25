package practice;
import java.util.Scanner;
public class ReverseString {

public static String Reverse(String str)
{int n=str.length();
    int i=0;
    int end=0;
    String newstring="";
    while(i<n)
    {
        if(str.charAt(i)==' ')
        {
int start=i-1;
while(start>=end)
{
newstring+=str.charAt(start);
start--;
}
end=i+1;
newstring+=" ";
        }
i++;

        }
        int start=i-1;
while(start>=end)
{
newstring+=str.charAt(start);
start--;
}
return newstring;

    }


    public static void main(String[]args)
    {
        Scanner s =new Scanner(System.in);
        String str=s.nextLine();
        String ans=Reverse(str);
        System.out.println(ans);
    }
}
