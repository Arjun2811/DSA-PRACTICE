package StructurallyIdenticall;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNodeUse {


public static boolean StructurallyIdenticall(TreeNode<Integer>root,TreeNode<Integer>root2)
{

    if(root==null&&root2==null)
    {
        return true;
    }
if(root==null||root2==null)
{
    return false;
}
if(root.Children.size()!=root2.Children.size())
{
    return false;
}

int i=0;
int j=0;

while(i<root.Children.size()&&j<root2.Children.size())
{
    boolean ans= StructurallyIdenticall(root.Children.get(i), root2.Children.get(j));
   if(ans==false)
   {
    return false;
   }
    i++;
    j++;
}
if(root.data!=root2.data)
{
    return false;
}
return true;



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
            TreeNode<Integer>root2=takeinput();
            // print(root);
            boolean ans=StructurallyIdenticall(root, root2);
            System.out.println(ans);
          
        }
    }
    
