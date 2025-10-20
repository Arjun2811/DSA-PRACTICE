package ContainXorNot;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNodeUse {



public static Boolean ContainX(TreeNode<Integer>root,int x)
{
if(root==null)
{
    return false;
}

int i=0;
boolean ans=false;
while(i<root.Children.size())
{
    ans=ContainX(root.Children.get(i),x);
    if(ans==true)
    {
        return true;
    }
    i++;
}
if(root.data==x)
{
    return true;
}
else if(ans==true)
{
    return true;
}
else{
    return false;
}

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
    {Scanner s = new Scanner(System.in);
        TreeNode<Integer>root=takeinput();
        int x=s.nextInt();
     boolean ans=ContainX(root,x);
     System.out.println(ans);
    }



}
