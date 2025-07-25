package ReturnAllCodes;

public class ALLCodes {


    public static String[] AllCodes(String str,int n)
    {
if(n<0)
{
String arr[]={""};
return arr;
}


String arr[]=AllCodes(str, n-1);
String arr2[]=AllCodes(str, n-2);
int x=str.charAt(n)-'0';
char ch =(char)('a'+x-1);
int i=0;
while(i<arr.length)
{
    arr[i]=arr[i]+ch;
    i++;
}
boolean secondarrworking=false;
if((n-1)>=0)
{
int f=str.charAt(n)-'0';
int z=str.charAt(n-1)-'0';
int c=(z*10)+f;

if(c>=10&&c<=26)
{secondarrworking=true;
char ch2=(char)('a'+c-1);

int h=0;
while(h<arr2.length)
{
arr2[h]=arr2[h]+ch2;
h++;
}
}
}
if(secondarrworking==true)
{
    String newarr[]=new String[arr.length+arr2.length];
     i=0;
     while(i<newarr.length)
     {
      int h=0;
     while(h<arr.length)
       {
        newarr[i]=arr[h];
        i++;
        h++;
     }
     int g=0;
     while(g<arr2.length)
     {
        newarr[i]=arr2[g];
        i++;
        g++;
     }


     }
     return newarr;
    }
     else{

        return arr;
     }

}




    
    public static void main(String[]args)
    {
        // String str="1123";
        String str="11";
       String arr[]= AllCodes(str,str.length()-1);
       for(String ele :arr)
       {
        System.out.println(ele);
       }
    }
}
