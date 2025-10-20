package DepthofaNode;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNodeUse {


public static void Depth(TreeNode<Integer>root,int k)
{

    if (root == null) {
        return;
    }

    if(k==0)
    {
        System.out.println(root.data);
        return;
    }


  int i=0;
  while(i<root.Children.size())
  {

       Depth(root.Children.get(i),k-1);
       i++;

  }

return;


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
            Depth(root,2);
          
        }
    }
    
    
    
    
    
    







