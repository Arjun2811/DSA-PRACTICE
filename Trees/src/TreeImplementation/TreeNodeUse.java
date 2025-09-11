package TreeImplementation;

public class TreeNodeUse {


    public static void main(String[]args)
    {
        TreeNode<Integer>root=new TreeNode<>(4);
        TreeNode<Integer>node1=new TreeNode<Integer>(10);
        TreeNode<Integer>node2=new TreeNode<Integer>(12);
        TreeNode<Integer>node3=new TreeNode<Integer>(15);
        TreeNode<Integer>node4=new TreeNode<Integer>(20);
        TreeNode<Integer>node5=new TreeNode<Integer>(25);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);
        node4.children.add(node5);

        System.out.println(root.children.get(0).data);
    }
}
