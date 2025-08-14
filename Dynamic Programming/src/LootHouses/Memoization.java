package LootHouses;

public class Memoization {


    public static int Loothouses(int[]arr,int n,int[]storage)
    {
if(n<0)
{
    return 0 ;
}



if(storage[n]!=-1)
{
    return storage[n];
}

int maxfinal1=Loothouses(arr,n-1,storage);
int max=Loothouses(arr,n-2,storage);
if(arr[n]+max>maxfinal1)
{
    storage[n]=arr[n]+max;
    return arr[n]+max;
}
else{
    storage[n]=maxfinal1;
    return maxfinal1;
}

    }

    public static void main(String[]args)
    {

        int arr[]={5,5,10,100,10,5};
        int storage[]=new int[arr.length+1];
        int i=0;
        while(i<storage.length)
        {
            storage[i]=-1;
            i++;
        }
        int ans=Loothouses(arr,arr.length-1,storage);
        System.out.println(ans);
    }
}


