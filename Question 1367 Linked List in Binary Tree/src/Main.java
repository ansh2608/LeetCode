public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        return dfs(head, head, root);
    }
    boolean dfs(ListNode head, ListNode cur, TreeNode root) {
        if (cur == null) return true;
        if (root == null) return false;
        if (cur.val == root.val) cur = cur.next;
        else if (head.val == root.val) head = head.next;
        else cur = head;
        return dfs(head, cur, root.left) || dfs(head, cur, root.right);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}