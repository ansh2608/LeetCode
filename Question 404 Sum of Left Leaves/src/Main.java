public class Main {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) { this.val = val; }
   }
    public static int sumOfLeftLeaves(TreeNode root) {
        if (root==null) return 0;
        int sum=0;
        if (root.left!=null){
            if (root.left.left==null && root.left.right==null)
                sum+=root.left.val;
            else sum+=sumOfLeftLeaves(root.left);
        }
        sum+=sumOfLeftLeaves(root.right);
        return sum;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        TreeNode a=new TreeNode(9);
        TreeNode b=new TreeNode(20);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(15);
        TreeNode d=new TreeNode(7);
        b.left=c;
        b.right=d;
        System.out.println(sumOfLeftLeaves(root));
    }
}