public class Main {
    static int maxDepth=0,ans=0;
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val; }
    }
    public static void dfs(TreeNode root,int depth){
        if (root==null) return;
        if (root.left==null && root.right==null && depth>maxDepth){
            ans=root.val;
            maxDepth=depth;
        }
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
    public static int findBottomLeftValue(TreeNode root) {
        dfs(root,1);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(3);
        root.left=a;
        root.right=b;
        System.out.println(findBottomLeftValue(root));
    }
}