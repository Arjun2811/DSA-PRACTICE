package Array;

public class ThirdLargestElement {


//5,8,7,6,
public static int thirdlargest(int[]arr)
{

int i=0;
int max=Integer.MIN_VALUE;
int secondmax=Integer.MIN_VALUE;
int thirdmax=Integer.MIN_VALUE;
while(i<arr.length)
{
    if(arr[i]>max)
    {   thirdmax=secondmax;
        secondmax=max;
        max=arr[i];
    }

    else if(arr[i]>secondmax&&arr[i]<max)
    {thirdmax=secondmax;
        secondmax=arr[i];
    }
    else if(arr[i]>thirdmax&&arr[i]<secondmax)
    {
        thirdmax=arr[i];
    }
    i++;
}
return thirdmax;



}



public static void main(String[]args)
{
    int arr[]={5,8,7,6};
    int ans=thirdlargest(arr);
    System.out.println(ans);
}



}
