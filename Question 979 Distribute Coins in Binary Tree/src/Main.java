public class Main {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) { this.val = val; }
    }
    private static int moves = 0;

    private static int dfs(TreeNode node) {
        if (node == null) return 0;
        int left_excess = dfs(node.left);
        int right_excess = dfs(node.right);
        moves += Math.abs(left_excess) + Math.abs(right_excess);
        return node.val + left_excess + right_excess - 1;
    }

    public static int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
    public static void main(String[] args) {
        int[] root = {3,0,0};
        System.out.println("Hello world!");
    }
}