/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int count = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        pre_order_traversal(root,low,high);
        return count;
    }
    public void pre_order_traversal(TreeNode root, int low, int high)
    {
        if(root == null)
            return;
        
        if(root.val >= low && root.val <= high)
            count = count + root.val;
        pre_order_traversal(root.left,low,high);
        pre_order_traversal(root.right,low,high);
    }

}