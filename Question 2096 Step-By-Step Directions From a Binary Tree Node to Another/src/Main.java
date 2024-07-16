public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    private static boolean find(TreeNode n, int val, StringBuilder sb) {
        if (n.val == val) return true;
        if (n.left != null && find(n.left, val, sb)) sb.append("L");
        else if (n.right != null && find(n.right, val, sb)) sb.append("R");
        return sb.length() > 0;
    }
    public static String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s = new StringBuilder(), d = new StringBuilder();
        find(root, startValue, s);
        find(root, destValue, d);
        int i = 0, max_i = Math.min(d.length(), s.length());
        while (i < max_i && s.charAt(s.length() - i - 1) == d.charAt(d.length() - i - 1)) ++i;
        return "U".repeat(s.length() - i) + d.reverse().toString().substring(i);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(3);
        a.left=c;
        TreeNode d=new TreeNode(6);
        TreeNode e=new TreeNode(4);
        b.left=d;
        b.right=e;
        int startValue = 3, destValue = 6;
        System.out.println(getDirections(root,startValue,destValue));
    }
}