class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}
public class Main {
    public static int pseudoPalindromicPaths(TreeNode root) {
        return countPseudoPalindromicPaths(root, 0);
    }
    private static int countPseudoPalindromicPaths(TreeNode node, int path) {
        if (node == null) {
            return 0;
        }

        path ^= (1 << node.val);

        if (node.left == null && node.right == null) {
            return (path & (path - 1)) == 0 ? 1 : 0;
        }

        return countPseudoPalindromicPaths(node.left, path) + countPseudoPalindromicPaths(node.right, path);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        TreeNode a=new TreeNode(3);
        TreeNode b=new TreeNode(1);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(1);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(1);
        b.right=e;
        System.out.println(pseudoPalindromicPaths(root));
    }
}