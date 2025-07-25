package PrintSubsequencesofaString;

public class PrintSubsequences {

public static void print(String str,int n,String output)
{
if(n==str.length())
{
System.out.println(output);
    return;
}


   
   
   
    print(str,n+1,output);
    print(str, n+1, output+str.charAt(n));
   
    }



    public static void main(String[]args)
    {
        String str="xyz";
        String output="";
        print(str,0,output);
       
    }
}
