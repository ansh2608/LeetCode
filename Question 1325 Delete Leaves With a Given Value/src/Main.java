public class Main {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) { this.val = val; }
    }
    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if (root.left == null && root.right == null && root.val == target) return null;
        return root;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}