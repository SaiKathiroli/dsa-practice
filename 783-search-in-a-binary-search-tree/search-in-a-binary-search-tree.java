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
    public TreeNode searchBST(TreeNode root, int val) 
    {
        if(root == null) return null;

        if(root.val == val) return root;

       TreeNode X =  searchBST(root.left,val); 
       TreeNode Y =  searchBST(root.right,val);

        if(X != null &&  X.val == val) return X;
        if(Y != null &&  Y.val == val) return Y;
        else return null;

    }
}