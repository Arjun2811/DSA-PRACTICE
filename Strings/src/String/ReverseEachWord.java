package String;

public class ReverseEachWord {

public static String ReverseEachWord(String str)
{
int i=0;
int start=0;
int end=0;
String newString="";
while(i<str.length())
{
if(str.charAt(i)==' ')
{

    start=i-1;
    while(start>=end)
    {
newString+=str.charAt(start);
start--;
    }
    end=i+1;
    newString+=" ";

}

    i++;
}
start=i-1;
while(start>=end)
{
newString+=str.charAt(start);
start--;
}
return newString;
}

public static void main(String[]args)
{
    String str="abc def ghi";
   String ans= ReverseEachWord(str);
   System.out.println(ans);
}


}
