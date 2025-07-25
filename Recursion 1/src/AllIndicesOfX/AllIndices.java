package AllIndicesOfX;

import java.util.ArrayList;
import java.util.Arrays;
//223448
public class AllIndices {


public static void AllIndices(int[]arr,int x,int si,ArrayList<Integer>arrnew)
{

if(si==arr.length-1)
{
if(arr[si]==x)
{
arrnew.add(si);
}
return;
}
if(arr[si]==x)
{
    arrnew.add(si);
}



AllIndices(arr,x,si+1,arrnew);
return;

}



public static int[] AllIndices(int[]arr,int x)
{
  Arrays.sort(arr);
  ArrayList<Integer>arrnew= new ArrayList<>();
  AllIndices(arr, x,0,arrnew);
  int finalarr[]=new int[arrnew.size()];
  int i=0;
  while(i<arrnew.size())
  {
    finalarr[i]=arrnew.get(i);
    i++;
  }
  return finalarr;
}

    public static void main(String[]args)
    {

        // int arr[]={2,3,4,8,4,2};
        int arr[]={2};
        int x=2;
       int ans[]= AllIndices(arr,x);
       for(int ele:ans)
       {
        System.out.println(ele);
       }
    }
}
