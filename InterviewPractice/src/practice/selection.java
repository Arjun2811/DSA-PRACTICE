package practice;

public class selection {


public static int[] Merge(int[]arr,int[]arr1)
{
int newarr[]= new int[arr.length+arr1.length];
int i=0;
int j=0;
int k=0;
while(i<arr.length&&j<arr1.length)
{
    if(arr[i]>=arr1[j])
    {
        newarr[k]=arr1[j];
        k++;
        j++;
    }
    else{
        newarr[k]=arr[i];
        i++;
        k++;
    }
}

while(i<arr.length)
{
    newarr[k]=arr[i];
    i++;
    k++;
}
while(j<arr1.length)
{
    newarr[k]=arr1[j];
    k++;
    j++;
}
return newarr;




}
    public static void main(String[]args)
    {

        int[]arr={1,4,6,10,13};
        int[]arr1={1,2,5,7,9};
       int newarr[]= Merge(arr,arr1);
        int i=0;
        while(i<newarr.length)
        {
            System.out.println(newarr[i]);
            i++;
        }
    }
}
