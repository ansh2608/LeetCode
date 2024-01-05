public class Path_Sum {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && root.val == sum) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        TreeNode a=new TreeNode(4);
        TreeNode b=new TreeNode(8);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(11);
        a.left=c;
        TreeNode d=new TreeNode(13);
        TreeNode e=new TreeNode(4);
        b.left=d;
        b.right=e;
        TreeNode f=new TreeNode(7);
        TreeNode g=new TreeNode(2);
        c.left=f;
        c.right=g;
        TreeNode h=new TreeNode(1);
        e.right=h;
        int targetSum=22;
        System.out.println(hasPathSum(root,targetSum));
    }
}
