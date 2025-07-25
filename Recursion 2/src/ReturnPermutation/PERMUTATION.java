package ReturnPermutation;

public class PERMUTATION {

//abc
public static String[] permutation(String str,int n)
{
if(n<0){
   
    String arr[]={""};
    return arr;
}

   String ans[]= permutation(str, n-1);
   int i=0;
   int g=0;
   String newarr[]=new String[ans.length*(ans[0].length()+1)];
   while(i<ans.length)
   {
String smallans=ans[i];
int f=0;

while(f<smallans.length())
{
   newarr[g]= smallans.substring(0, f)+str.charAt(n)+smallans.substring(f);
   g++;
   f++;
}
newarr[g]=smallans+str.charAt(n);
g++;
i++;
   }
   return newarr;

}
    public static void main(String[]args)
    {
        String str="abc";
        String ans[]=permutation(str,str.length()-1);
        for(String ele:ans)
        {
            System.out.println(ele);
        }
    }
}
