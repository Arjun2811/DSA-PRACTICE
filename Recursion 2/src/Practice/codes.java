package Practice;
import java.util.Scanner;
public class codes {


public static String[] permutation(String str,int n)
{
if(n==str.length())
{
String[]arr={" "};
return arr;
}



   String[]arr= permutation(str,n+1);
   String newarr[]=new String[arr.length*(arr[0].length()+1)];
   int i=0;
   int f=0;
   while(i<arr.length)
   {
    int j=0;
    while(j<arr[0].length())
    {

        newarr[f]=arr[i].substring(0,j)+str.charAt(n)+arr[i].substring(j);
        j++;
        f++;
    }
    newarr[f]=str.charAt(n)+arr[i];
    f++;
    i++;
   }
   return newarr;
}







    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
String str=s.next();
String arr[]=permutation(str,0);
int i=0;
while(i<arr.length)
{
    System.out.println(arr[i]);
    i++;
}

}


}