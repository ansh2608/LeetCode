public class Insert_into_a_BST {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
    }
    public static int height(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void print(TreeNode root,int n){
        if (root==null) return;
        if (n==1) System.out.print(root.val+" ");
        print(root.left,n-1);
        print(root.right,n-1);
    }
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null) return new TreeNode(val);
        if (root.val>val){
            if (root.left==null) root.left=new TreeNode(val);
            else insertIntoBST(root.left,val);
        }
        else {
            if (root.right==null) root.right=new TreeNode(val);
            else insertIntoBST(root.right,val);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(7);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(1);
        TreeNode d=new TreeNode(3);
        a.left=c;
        a.right=d;
        int val=5;
        TreeNode bst=insertIntoBST(root,val);
        int level=height(bst)+1;
        for (int i=1;i<=level;i++){
            print(bst,i);
            System.out.println();
        }
    }
}
