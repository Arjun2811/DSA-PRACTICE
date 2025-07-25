package FirstIndexOfX;

public class FirstIndex {



    public static int FirstIndex(int[]arr,int x,int n){

if(n==0)
{
   if(arr[n]==x)
   {
    return n;
   }
   return -1;
}







int ans=FirstIndex(arr,x,n-1);
if(ans==-1&&arr[n]==x)
{
    ans=n;
    
}
return ans;

    }
    public static void main(String[]args)
    {
        int arr[]={2,3,4,5,2};
        int x=4;
       int ans= FirstIndex(arr,x,arr.length-1);
       System.out.println(ans);
    }
}
