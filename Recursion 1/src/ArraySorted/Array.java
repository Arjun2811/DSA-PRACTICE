package ArraySorted;

public class Array {


//12345
public static int Array(int[]arr,int n)
{
if(n==0)
{
    return 1;
}


   int ans= Array(arr,n-1);
   if(ans==0)
   {
    return 0;
   }
//    else if(n+1==arr.length)
//    {
//     if(ans==1)
//     {
//         return 1;
//     }
//     else{
//         return 0;
//     }
//    }

   else if(arr[n]>=arr[n-1])
   {
    return 1;
   }
   else{
    return 0;
   }
  



}

    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,1};
        int ans=Array(arr,arr.length-1);
        System.out.println(ans);
        }
    }

