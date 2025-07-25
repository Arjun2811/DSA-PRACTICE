package Stockspan;

public class StockSpanUse {


public static int[] Stock(int[]arr)
{
    StackUsingLL s1=new StackUsingLL();
    int i=0;
    while(i<arr.length)
    {
        s1.push(arr[i]);
        i++;
    }
    int max=0;
    int g=arr.length-1;
    int []output=new int[g+1];
    while(!s1.isempty())
    {int count=1;
        int value=s1.top();
 i=s1.size()-2;
        while((i)>=0)
        {
            if(arr[i]<value)
            {
                count++;
            }
            else{
                break;
                // // if(count>max)
                // // {
                // // max=count;
                // // }

                // count=1;
            }
            i--;
        }
        s1.pop();
        output[g]=count;
        g--;

    }

return output;


}


    public static void main(String[]args)
    {

        int[]arr={60,70,80,100,90,75,80,120};
        int[]arr2=Stock(arr);
        int f=0;
        while(f<arr2.length)
        {
            System.out.println(arr2[f]);
            f++;
        }
    }
}
