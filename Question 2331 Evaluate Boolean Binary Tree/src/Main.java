public class Main {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
   }
    public static boolean helper(TreeNode root) {
        if(root.val == 0 || root.val == 1) return root.val == 1;
        else if(root.val == 2) return helper(root.left) || helper(root.right);
        else if(root.val == 3) return helper(root.left) && helper(root.right);
        return false;
    }
    public static boolean evaluateTree(TreeNode root) {
        return helper(root);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}