import java.util.*;

public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    public static TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedElements = new ArrayList<>();
        collectInOrder(root, sortedElements);
        return constructBalancedBST(sortedElements, 0, sortedElements.size() - 1);
    }

    private static void collectInOrder(TreeNode node, List<Integer> sortedElements) {
        if (node == null) return;
        collectInOrder(node.left, sortedElements);
        sortedElements.add(node.val);
        collectInOrder(node.right, sortedElements);
    }

    private static TreeNode constructBalancedBST(List<Integer> elements, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(elements.get(mid));
        node.left = constructBalancedBST(elements, start, mid - 1);
        node.right = constructBalancedBST(elements, mid + 1, end);
        return node;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(3);
        TreeNode c=new TreeNode(4);
        root.right=a;
        a.right=b;
        b.right=c;
        balanceBST(root);
    }
}