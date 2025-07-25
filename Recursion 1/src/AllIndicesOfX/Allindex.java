package AllIndicesOfX;

import java.util.ArrayList;

public class Allindex{

public static void AllIndex(int[]arr,int n,int x,ArrayList<Integer>arr1)
{
if(n==arr.length-1)
{
    if(arr[n]==x)
    {
        arr1.add(n);
        return;
    }
    else{
        return;
    }
}

if(arr[n]==x)
{
    arr1.add(n);
    
}



    AllIndex(arr, n+1, x, arr1);
   return;


}
    public static void main(String[]args)
    {
ArrayList<Integer>arr1=new ArrayList<>(); 
int[]arr={8,4,3,8,3,32,24,1,23,8};
 AllIndex(arr,0,8,arr1);
 for(int ele :arr1)
 {
    System.out.println(ele);
 }


    }
}

