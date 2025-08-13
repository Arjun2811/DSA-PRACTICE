package Practice;

import java.util.Stack;

public class StackUse {

public static int[] Stockspan(int []arr)
{
    int arr1[]=new int[arr.length];
    int n=arr.length-1;
int i=0;
Stack<Integer> s1=new Stack<>();
while(i<arr.length)
{
s1.add(arr[i]);
i++;
}
while(!s1.isEmpty())
{int count=1;
i=s1.size()-2;
int value=s1.pop();
while(i>=0)
{

  
    if(arr[i]>value)
    {
        break;
    }

count++;
   i--;
}
arr1[n]=count;
n--;
}

return arr1;

}
    public static void main(String[]args)
    {
       int arr[]={60,70,80,100,90,75,80,120};
        int ans[]=Stockspan(arr);
        int i=0;
        while(i<ans.length)
        {
            System.out.println(ans[i]);
            i++;
        }
       
    }
}
