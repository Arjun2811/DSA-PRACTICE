package SecondLargest;


import java.util.ArrayList;

public class TreeNode<T> {

    T data;
    ArrayList<TreeNode<Integer>>Children;

    public TreeNode(T data)
    {
        this.data=data;
        Children=new ArrayList<>();
    }
}
