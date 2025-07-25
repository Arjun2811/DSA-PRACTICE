package LastIndexOfX;

public class LastIndex2 {

    public static int LastIndex(int[]arr,int n,int x)
    {
    if(n==arr.length-1)
    {
        if(arr[n]==x)
        {
            return n;
        }
        else{
            return -1;
        }
    }
    
    
    
    
    int ans=LastIndex(arr, n+1, x);
    if(ans==-1&&arr[n]==x)
    {
        return n;
    }
    else if(ans==-1&&arr[n]!=x)
    {
        return -1;
    }
    else{
        return ans;
    }
    
    
    
    
    }
        public static void main(String[]args)
        {
    
    int[]arr={8,4,3,8,3,32,24,1,23,8};
      int ans= LastIndex(arr,0,8);
      System.out.println(ans);
    
        }
    }
    
