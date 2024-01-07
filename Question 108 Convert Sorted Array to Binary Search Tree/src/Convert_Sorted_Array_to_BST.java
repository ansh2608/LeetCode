public class Convert_Sorted_Array_to_BST {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static int height(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void nthLevel(TreeNode root,int n){
        if (root==null) return;
        if (n==1) System.out.print(root.val+" ");
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static TreeNode helper(int[] arr,int lo,int hi){
        if (lo>hi) return null;
        int mid=lo+(hi-lo)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=helper(arr,lo,mid-1);
        root.right=helper(arr,mid+1,hi);
        return root;
    }
    public static TreeNode sortedArrayToBST(int[] arr) {
        return helper(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr={-10,-3,0,5,9};
        TreeNode root=sortedArrayToBST(arr);
        int level=height(root)+1;
        for (int i=1;i<level;i++){
            nthLevel(root,i);
            System.out.println();
        }
    }
}
