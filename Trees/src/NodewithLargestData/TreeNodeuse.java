package NodewithLargestData;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNodeuse {



public static int LargestNode(TreeNode<Integer>root)
{
if(root==null)
{
    return Integer.MIN_VALUE;
}

if(root.Children.size()==0){

return root.data;

}



    int i=0;
    int max=Integer.MIN_VALUE;
    while(i<root.Children.size())
    {
        int ans=LargestNode(root.Children.get(i));
if(ans>max)
{
max=ans;
}
        i++;
    }
    if(root.data>max)
    {
max=root.data;
    }
    return max;
}







    public static TreeNode<Integer> takeinput()
    {Scanner s= new Scanner(System.in);
        Queue<TreeNode<Integer>> q1=new LinkedList();
System.out.println("Enter the root node");
int n=s.nextInt();
TreeNode<Integer>root=new TreeNode<Integer>(n);
q1.add(root);
while(!q1.isEmpty())
{
    TreeNode<Integer> t1=q1.remove();
    int i=0;
    System.out.println("Tell me the no. of children for : "+ t1.data );
     n=s.nextInt();
    while(i<n)
    {
        System.out.println("Enter node"+ " : " +i);
        int data=s.nextInt();
        TreeNode<Integer>node1=new TreeNode<Integer>(data);
        t1.Children.add(node1);
        q1.add(node1);
i++;
      
    }
}

return root;
    }

public  static void print(TreeNode<Integer>root)
{
    Queue<TreeNode<Integer>> q1=new LinkedList();
    q1.add(root);
    System.out.println(root.data);
    while(!q1.isEmpty())
    {

        TreeNode<Integer>t1=q1.remove();
     
        int i=0;
while(i<t1.Children.size())
{
q1.add(t1.Children.get(i));
System.out.print(t1.Children.get(i).data+" ");

 i++;
        }
        System.out.println();
      
    }
        

}
    public static void main(String[]args)
    {
        TreeNode<Integer>root=takeinput();
        // print(root);
        int ans=LargestNode(root);
        System.out.println(ans);
    }
}




