package Knapsack;

public class DP {




    public static void main(String[]args)
    {
        int weight[]={2,3,4,5};
        int value[]={5,6,7,8};
int maxweight=5;
        int storage[][]=new int[weight.length+1][maxweight+1];
        int i=weight.length;
        int j=0;
        while(j<maxweight+1)
        {
            storage[i][j]=0;
            j++;
        }
        j=0;
        i=0;
        while(i<weight.length+1)
        {
storage[i][j]=0;
i++;

        }
        
        i=weight.length-1;
        while(i>=0)
        {
            j=1;
            while(j<maxweight+1)
            {


                if(weight[i]>j)
                {
                    storage[i][j]=storage[i+1][j];
                }
                else{
                    storage[i][j]=Math.max(value[i]+storage[i+1][j-weight[i]],storage[i+1][j]);
                }
j++;
            }
            i--;
        }
       System.out.println(storage[0][maxweight]); ;
        

       
    }
}
