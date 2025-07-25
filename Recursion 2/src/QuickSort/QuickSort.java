package QuickSort;

public class QuickSort {

public static void QuickSort(int[]arr,int si,int ei)
{
if(si>=ei)
{
    return;
}

int pivotposition=partition(arr,si,ei);
QuickSort(arr,si,pivotposition-1);
QuickSort(arr, pivotposition+1, ei);
}



public static void swap(int[]arr,int a,int b)
{

int x=arr[a];
arr[a]=arr[b];
arr[b]=x;

}
public static int partition(int[]arr,int si,int ei)
{


int pivotpos=si;
int pivot=arr[si];
int i=si+1;
int j=si+1;
while(j<=ei)
{
    if(arr[j]<pivot)
    {
        pivotpos++;
        swap(arr,j,pivotpos);

    }
    j++;
}
swap(arr,si,pivotpos);

return pivotpos;

}


    public static void main(String[]args)
    {
        int arr[]={1,2,3,5,7};
        QuickSort(arr,0,arr.length-1);
        int i=0;
        while(i<arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }
        }
    }

