package Array;

public class SelectionSort {

public static void Selection(int[]arr)
{
int i=0;
while(i<arr.length-1)
{
int min=Integer.MAX_VALUE;
int j=i;
int minindex=0;
while(j<arr.length)
{
if(arr[j]<min)
{
    min=arr[j];
     minindex=j;
}
j++;

}
int temp=arr[i];
arr[i]=arr[minindex];
arr[minindex]=temp;

i++;
}
}

    public static void main(String[] args) {
        int arr[]={1,3,0,4,2,7,6};
        Selection(arr);
     int i=0;
     while(i<arr.length)
     {
 System.out.println(arr[i]);
 i++;
        }
    }
}
