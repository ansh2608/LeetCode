public class Iterative {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
    }
    public static void flatten(TreeNode root) {
        TreeNode curr=root;
        while (curr!=null){
            if (curr.left!=null){
                TreeNode pred=curr.left;
                while (pred.right!=null) pred=pred.right;
                pred.right=curr.right;
                curr.right=curr.left;
                curr.left=null;
            }
            curr=curr.right;
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(5);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(6);
        b.right=e;
        flatten(root);
    }
}
