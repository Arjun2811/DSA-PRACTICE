package Knapsack;
public class Recursion {



public static int Knapsack(int weight[],int value[],int maxweight,int i)
{
if(i==weight.length||maxweight==0)
{
    return 0;
}


if(weight[i]>maxweight)
{
    int ans=Knapsack(weight,value,maxweight,i+1);
    return ans;
}
else{

int pickup=value[i]+Knapsack(weight, value, maxweight-weight[i], i+1);
int notpickup=Knapsack(weight,value,maxweight,i+1);
return Math.max(pickup,notpickup);

}






   }







    public static void main(String[]args)
    {
        int weight[]={1,2,4,5};
        int value[]={5,4,8,6};
        int ans=Knapsack(weight,value,5,0);
        System.out.println(ans);
    }
}
