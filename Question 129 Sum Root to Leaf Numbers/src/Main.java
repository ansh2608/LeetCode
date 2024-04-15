public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
    private static int ans = 0;
    private static void dfs(TreeNode root, int path) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            ans += path * 10 + root.val;
            return;
        }
        dfs(root.left, path * 10 + root.val);
        dfs(root.right, path * 10 + root.val);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        TreeNode a=new TreeNode(9);
        TreeNode b=new TreeNode(0);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(5);
        TreeNode d=new TreeNode(1);
        a.left=c;
        a.right=d;
        System.out.println(sumNumbers(root));
    }
}