package SumofArray;

public class Sum {
//12345
    public static int Sum(int[]arr,int n){

if(n==0)
{
    return arr[n];
}



       int ans= Sum(arr,n-1);
       ans+=arr[n];
       return ans;




    }


public static void main(String[]args){
    int arr[]={1};
    int ans=Sum(arr,arr.length-1);
    System.out.println(ans);
}

}
