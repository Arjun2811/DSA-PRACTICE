package ByteLandian;
import java.util.Scanner;
import java.util.HashMap;

public class DP {




public static void main(String[]args)
{Scanner s = new Scanner(System.in);
    HashMap<Long,Long>memo=new HashMap<>();
    long i=0;
    Long n=s.nextLong();
    memo.put(i,i);
    i=1;
    while(i<n+1)
    {
Long a=memo.get(i/2);
Long b=memo.get(i/3);
Long c=memo.get(i/4);

if(a+b+c>i)
{
    memo.put(i,a+b+c);
}
else{
    memo.put(i,i); 
}
i++;
    }
    System.out.println(memo.get(n));
}

}
