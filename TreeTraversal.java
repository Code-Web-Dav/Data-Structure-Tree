// import java.util.*;
class TreeNode{
    int Value;
    TreeNode left,right;
    TreeNode(int Value){
        this.Value = Value;
        left=right=null;
    }
}
public class TreeTraversal{
    public void preorder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.Value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void main(String args[]){
        TreeNode Root = new TreeNode(1);
        Root.left = new TreeNode(2);
        Root.right = new TreeNode(3);
        Root.left.left = new TreeNode(4);
        Root.left.right = new TreeNode(5);
        TreeTraversal tree = new TreeTraversal();
        System.out.println("Preorder");
        tree.preorder(Root);
    
    }
}

