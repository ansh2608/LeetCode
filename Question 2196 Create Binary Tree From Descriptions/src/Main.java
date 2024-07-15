public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode[] map = new TreeNode[100001];
        boolean[] child = new boolean[100001];
        for (int[] d : descriptions){
            if (map[d[0]] == null) map[d[0]] = new TreeNode(d[0]);
            TreeNode node = (map[d[1]] == null ? new TreeNode(d[1]) : map[d[1]]);
            if (d[2] == 1) map[d[0]].left = node;
            else map[d[0]].right = node;
            map[node.val] = node;
            child[d[1]] = true;
        }
        for (int[] d : descriptions)
            if (!child[d[0]])
                return map[d[0]];
        return null;
    }
    public static void main(String[] args) {
        int[][] descriptions = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        TreeNode ans=createBinaryTree(descriptions);
    }
}