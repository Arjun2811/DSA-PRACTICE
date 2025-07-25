package FindaNode;
import java.util.LinkedList;
import java.util.Scanner;
public class UsingCollections {




    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int data=s.nextInt();
        LinkedList<Integer>LL=new LinkedList<>();
        while(data!=-1)
        {
LL.add(data);
data=s.nextInt();

        }
        int x =5;
        int i =0;
        while(i<LL.size())
        {
if(LL.get(i)==x)
{
    System.out.println(i);
    return;
}
i++;
        }
        System.out.println(-1);
    }
}
