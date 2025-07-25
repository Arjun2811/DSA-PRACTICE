package Practice;
import java.util.Scanner;
public class codes {





public static void swap(int[]arr ,int a ,int b)
{

int temp=arr[a];
arr[a]=arr[b];
arr[b]=temp;


}





public static void QuickSort(int[]arr,int si,int ei)
{
if(si>=ei)
{
    return;
}



    int pivotpos=partition(arr,si,ei);
    QuickSort(arr,si,pivotpos-1);
    QuickSort(arr, pivotpos+1, ei);
}
public static int partition(int[]arr,int si,int ei)
{

int pivot=arr[si];
int pivotpos=si;
int i=si+1;
while(i<=ei)
{
    if(arr[i]<=pivot)
    {
pivotpos++;
swap(arr,i,pivotpos);
    }
    i++;
}
swap(arr,si,pivotpos);
return pivotpos;
}


    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
int arr[]={4,5,6,2,1,0};
QuickSort(arr,0,arr.length-1);
int i=0;
while(i<arr.length)
{
    System.out.println(arr[i]);
    i++;
}


}}