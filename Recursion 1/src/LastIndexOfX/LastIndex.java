package LastIndexOfX;

public class LastIndex {
//23454
public static int LastIndex(int[]arr,int x,int n)
{
if(n==0)
{
    if(arr[n]==x)
    {
        return n;
    }
    return -1;
}
if(arr[n]==x)
{
    return n;
}


    int index=LastIndex(arr, x,n-1);
    return index;
}

    public static void main(String[]args)
    {
        
        int []arr={2,3,4,5,6,4};
        int x=2;
        int ans=LastIndex(arr,x,arr.length-1);
        System.out.println(ans);
    }
}
