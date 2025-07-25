package MergeSort;

public class MergeSort {


    //2,3,6,1,9,0
public static void MergeSort(int[]arr,int si,int ei)
{
int f=si;
int g=ei;
if(si>=ei)
{
    return;
}
    int mid=(si+ei)/2;

    MergeSort(arr,si,mid);
    MergeSort(arr,mid+1,ei);
    Merge(arr,si,ei);
}
//156
//234
public static void Merge(int[]arr,int si,int ei)
{int newarr[]=new int[ei-si+1];
    int f=si;
int g=ei;
    int mid=(si+ei)/2;
    int m=mid+1;
    int i=0;
    while(si<=mid&&m<=ei)
    {
if(arr[si]<=arr[m])
{newarr[i]=arr[si];
i++;
si++;
}
else {
    newarr[i]=arr[m];
    i++;
    m++;
}

    }
    while(si<=mid)
    {
        newarr[i]=arr[si];
        si++;
        i++;
    }
    while(m<=ei)
    {
        newarr[i]=arr[m];
        i++;
        m++;
    }
    i=0;
    while(i<newarr.length)
    {
        arr[f]=newarr[i];
        i++;
        f++;
    }
}






    public static void main(String[]args)
    {
        int arr[]={2,3,6,1,9,0};
        MergeSort(arr,0,arr.length-1);
        int i=0;
        while(i<arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }
    }
}
