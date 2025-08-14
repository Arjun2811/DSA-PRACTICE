package LootHouses;

public class DP {


public static void main(String[]args)
{
int arr[]={5,5,10,100,10,5};


    int storage[]=new int[arr.length];
    storage[0]=arr[0];
    storage[1]=arr[1];
    int n=2;
    while(n<storage.length)
    {
if(storage[n-1]>storage[n-2]+arr[n])
{
storage[n]=storage[n-1];

}
else{
    storage[n]=storage[n-2]+arr[n];
}
n++;
    }
    System.out.println(storage[n-1]);
}

}
