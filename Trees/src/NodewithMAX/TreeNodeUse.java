package NodewithMAX;




import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNodeUse {


public static Max<Integer> Nodewithmax(TreeNode<Integer>root)
{
    if(root==null)
    {
        return null;
    }
int i=0;
Max<Integer> maxnode=new Max<>();
maxnode.maximum=0;
maxnode.node=root;
while(i<root.Children.size())
{


Max<Integer>node=Nodewithmax(root.Children.get(i));
if(node.maximum>maxnode.maximum)
{
    maxnode.maximum=node.maximum;
    maxnode.node=node.node;

}
i++;


}
int f=0;
int smallans=root.data;
while(f<root.Children.size())
{
    smallans+=root.Children.get(f).data;
    f++;
}
if(smallans>maxnode.maximum)
{
    Max<Integer>maxnode2=new Max<>();
    maxnode2.node=root;
    maxnode2.maximum=smallans;
    return maxnode2;
}
return maxnode;
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
         Max<Integer>node= Nodewithmax(root);
         System.out.println(node.node.data);
         System.out.println(node.maximum);
          
        }
    }
    
    
    
    
    
    








