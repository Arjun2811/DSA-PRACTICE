package CheckNumber;

public class CheckNumb {

//12345
public static boolean check(int[]arr,int n,int k)
{
if(n==0)
{
    if(arr[n]==k)
    {  
        return true;
    }
    else{
return false;
    }
}




boolean ans=check(arr,n-1,k);
if(ans==true)
{
    return true;
}
else if(arr[n]==k){
    return true;

}
else{
    return false;
}

}



    public static void main(String[] args) {
        
        int arr[]={5};
        boolean ans=check(arr,arr.length-1,5);
        System.out.println(ans);
    }
}
