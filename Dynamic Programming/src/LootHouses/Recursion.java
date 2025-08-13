package LootHouses;

public class Recursion {


    


    public static int Loothouses(int[]arr,int n)
    {
if(n<0)
{
    return 0 ;
}





int maxfinal1=Loothouses(arr,n-1);
int max=Loothouses(arr,n-2);
if(arr[n]+max>maxfinal1)
{
    return arr[n]+max;
}
else{
    return maxfinal1;
}




    }

    public static void main(String[]args)
    {

        int arr[]={2,3,1000,2000};
        int ans=Loothouses(arr,arr.length-1);
        System.out.println(ans);
    }
}
