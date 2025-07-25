package Array;

public class Merge2SortedArrays {



public static int[] merge(int[]arr1,int[]arr2)
{

int arr3[]= new int[arr1.length+arr2.length];


int i=0;
int j=0;
int k=0;
while(i<arr1.length&&j<arr2.length)
{
if(arr1[i]>=arr2[j])
{
    arr3[k]=arr2[j];
    k++;
    j++;
}
else{
    arr3[k]=arr1[i];
    k++;
    i++;
}
}
while(i<arr1.length)
{
    arr3[k]=arr1[i];
    i++;
    k++;
}
while(j<arr2.length)
{
    arr3[k]=arr2[j];
    j++;
    k++;
}

return arr3;


}






    public static void main(String[] args) {
        int arr1[]={1,4,6,10,13};
        int arr2[]={2,5,7,9,10,11};

       int []arr= merge(arr1,arr2);
       int i=0;
       while(i<arr.length)
       {
        System.out.println(arr[i]);
        i++;
       }
    }
}
