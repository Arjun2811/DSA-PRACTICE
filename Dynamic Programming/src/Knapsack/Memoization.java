package Knapsack;

public class Memoization {



    public static int Knapsack(int weight[],int value[],int maxweight,int i,int[][]storage)
    {
    if(i==weight.length||maxweight==0)
    {
        return 0;
    }
    


if(storage[i][maxweight]!=-1)
{
    return storage[i][maxweight];
}




    if(weight[i]>maxweight)
    {
        int ans=Knapsack(weight,value,maxweight,i+1,storage);
        storage[i][maxweight]=ans;
        return ans;
    }
    else{
    
    int pickup=value[i]+Knapsack(weight, value, maxweight-weight[i], i+1,storage);
    int notpickup=Knapsack(weight,value,maxweight,i+1,storage);
    storage[i][maxweight]=Math.max(pickup,notpickup);
    return storage[i][maxweight];
    }
       }
        public static void main(String[]args)
        {
            int weight[]={9,8,1,9};
            int value[]={6,10,8,8};
            int maxweight=16;
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
            int ans=Knapsack(weight,value,maxweight,0,storage);
            System.out.println(ans);
        }
}
