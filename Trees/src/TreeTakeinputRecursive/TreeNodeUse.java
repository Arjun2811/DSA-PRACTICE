package TreeTakeinputRecursive;
import java.util.Scanner;
public class TreeNodeUse {

 
public static TreeNode takeinput(Scanner s)
{
   
System.out.println("Enter the root node");
int n=s.nextInt();
TreeNode root=new TreeNode(n);
System.out.println("Tell me the no. children");
int childCount=s.nextInt();
int i=0;
while(i<childCount)
{
   TreeNode ans= takeinput(s);
   root.children.add(ans);
   i++;
}
return root;

}
public static void print(TreeNode root)
{

String s=root.data+":";
int i=0;
while(i<root.children.size())
{
    s+=root.children.get(i).data+",";
    i++;
}
System.out.println(s);
i=0;
while(i<root.children.size())
{
   print(root.children.get(i));
    i++;
}








}
public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    TreeNode root=takeinput(s);
    print(root);
}






}
