package Array;

public class BubbleSort {

public static void BubbleSort(int[]arr)
{
int i=0;
while(i<arr.length-1)
{

int j=0;
while(j<arr.length-1-i)
{
    if(arr[j]>arr[j+1])
    {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
    j++;
}
i++;


}





}

    public static void main(String[]args)
    {
        int arr[]={1,3,5,6,7,8};

        BubbleSort(arr);
        int i=0;
        while(i<arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }

    }
}
