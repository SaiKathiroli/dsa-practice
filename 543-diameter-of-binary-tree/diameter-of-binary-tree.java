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
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root==null)return 0;
        int lhs=diameterOfBinaryTree(root.left);
        int rhs=diameterOfBinaryTree(root.right);
        
        return Math.max(helper(root.left)+helper(root.right)+2, Math.max(lhs, rhs));
    }

    public int helper(TreeNode root)
    {
        if(root == null) return -1;

        return 1 + Math.max(helper(root.left),helper(root.right));
    }
}