

class TreeNode{
    int Value;
    TreeNode left,right;
    TreeNode(int Value){
        this.Value = Value;
        left=right=null;
    }
}
public class inorder{
    public void inorderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.Value + " ");
        inorderTraversal(root.right);
    }
    public static void main(String args[]){
    TreeNode Root = new TreeNode(1);
    Root.left = new TreeNode(2);
    Root.right = new TreeNode(3);
    Root.left.left = new TreeNode(4);
    Root.left.right = new TreeNode(5);
    inorder Tree = new inorder();
    System.out.println("Inorder Traversal");
    Tree.inorderTraversal(Root);

    }
}