package BinarySearch;

public class BinarySearch {

public static  int Binary(int []arr,int si,int ei,int x)
{
if(si>ei)
{
    return -1;
}
if(si==ei)
{
    if(arr[si]==x)
    {
        return si;
    }
}



int mid=(si+ei)/2;

if(x==arr[mid])
{
    return mid;
}

else if(x<arr[mid])
{
     int ans=Binary(arr,si,mid,x);
     return ans;
}
else
{
    int ans= Binary(arr,mid+1,ei,x);
    return ans;
}


}


    public static void main(String[]args)
    {
        int[]arr={2,3,4,5,6};
        int ans=Binary(arr,0,arr.length-1,6);
        System.out.println(ans);

    }
}
