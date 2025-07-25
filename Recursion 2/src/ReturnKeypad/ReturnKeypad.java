package ReturnKeypad;

public class ReturnKeypad {


//23;
    public static String[] keypad(int n)
    {if(n==0||n==1)
        {
            String arr[]={""};
            return arr;
        }


        String smallans1=helper(n%10);

        String smallans[]=keypad(n/10);
        String newarr[]= new String[smallans.length*smallans1.length()];
        int i=0;
        int f=0;
        while(i<smallans1.length())
        {
          char ch=  smallans1.charAt(i);
          int j=0;
          
          while(j<smallans.length)
          {
newarr[f]=smallans[j]+ch;
j++;
f++;
          }
          i++;
        }
        return newarr;



    }
    public static String helper(int n)
    {
        
        
            if(n==0||n==1)
            {
                return " ";
            }
        if(n==2)
        {
            return "abc";
        }
        if(n==3)
        {
            return "def";
        }
        if(n==4)
        {
         return "ghi";
        }
        if(n==5)
        {
            return "jkl";
        }
        if(n==6)
        {
            return "mno";
        }
        if(n==7)
        {
            return "pqrs";
        }
        if(n==8)
        {
            return "tuv";
        }
        else
        {
            return "wxyz";
        }
        
        


    }


    public static void main(String[]args)
    {
        int n=354;
       String ans[]= keypad(n);
       for( String ele:ans)
       {
        System.out.println(ele);
       }
    }
}
