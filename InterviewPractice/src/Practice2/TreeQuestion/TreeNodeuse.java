package Practice2.TreeQuestion;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class TreeNodeuse {














public static void print(TreeNode<Integer>root)
{
Queue<TreeNode<Integer>>q1=new LinkedList<>();
q1.add(root);
while(!q1.isEmpty())
{TreeNode<Integer>removed=q1.remove();
    String str="";
     str+=removed.data+" : ";
int i=0;
     while(i<removed.Children.size())
     {
TreeNode<Integer>child=removed.Children.get(i);
q1.add(child);
str+=child.data+" , ";
i++;
     }
     System.out.println(str);
}

    
}
public static TreeNode<Integer> takeinput(Scanner s)
{
System.out.println("Enter the root node");
   int data=s.nextInt();
   TreeNode<Integer>root=new TreeNode<Integer>(data);
   Queue<TreeNode<Integer>>q1=new LinkedList<>();
   q1.add(root);
   while(!q1.isEmpty())
   {
    TreeNode<Integer> ans=q1.remove();
    System.out.println("Enter the no. children for"+ ans.data);
    int n=s.nextInt();
    int i=0;
    while(i<n)
    {System.out.println("Enter the children for "+ ans.data);
        int childdata=s.nextInt();
        TreeNode<Integer>child=new TreeNode<Integer>(childdata);
        ans.Children.add(child);
      q1.add(child);
      i++;
       
    }
   }
return root;
    
}

    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
       
      TreeNode<Integer>root=takeinput(s);
    //    print(root);
  
    int ans=height(root);
   System.out.println(ans);
    }
}
