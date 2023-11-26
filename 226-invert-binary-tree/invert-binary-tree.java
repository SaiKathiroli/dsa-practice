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
    public TreeNode invertTree(TreeNode root) 
    {
      if( root != null ){

            // General case:
            // invert child node of current root
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            // invert subtree with DFS
            invertTree(root.left);
            invertTree(root.right);
            return root;

        }else{
            // Base case:
            // empty tree or empty node
            return null; 
        }
    }
}