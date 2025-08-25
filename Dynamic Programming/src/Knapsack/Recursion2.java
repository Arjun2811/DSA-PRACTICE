package Knapsack;

public class Recursion2 {





    public static int Knapsack(int[]weight,int[] value,int i,int j,int maxweight,int[][]storage)
    {

if(maxweight==0||i==weight.length||j==value.length)
{
    return 0;
}



if(storage[i][maxweight]!=-1)
{
    return storage[i][maxweight];
}




if(weight[i]>maxweight)
{
    int ans=Knapsack(weight,value,i+1,j+1,maxweight,storage);
    storage[i][maxweight]=ans;
    return ans;
}



        int pickup= value[i]+Knapsack(weight, value, i+1,j+1, maxweight-weight[i],storage);
        int notpickup=Knapsack(weight,value,i+1,j+1,maxweight,storage);
        storage[i][maxweight]=Math.max(pickup,notpickup);
        return storage[i][maxweight];
    }


    public static void main(String[]args)
    {
        int weight[]={1,2,4,5};
        int value[]={5,10,15,20};
        int maxweight=5;
        int storage[][]=new int[weight.length+1][maxweight+1];
        int i=0;
        while(i<weight.length+1)
        {
            int j=0;
            while(j<maxweight+1)
            {
                storage[i][j]=-1;
                j++;
            }
            i++;
        }

       int ans= Knapsack(weight,value,0,0,5,storage);
       System.out.println(ans);
    }
}
