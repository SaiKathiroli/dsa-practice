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
    public int maxLevelSum(TreeNode root) 
    {
        int refMax = Integer.MIN_VALUE;
        int reflevel = 1;
        Queue<TreeNode> qk = new LinkedList<>();
        qk.add(root);
        int level = 1;
        while(!qk.isEmpty())
        {
            int count = qk.size();
            int sum = 0;
            while(count != 0)
            {
                TreeNode X = qk.remove();
                sum = sum + X.val;
                if(X.left != null) qk.add(X.left);
                if(X.right != null) qk.add(X.right);
                count = count-1;
            }
            if(sum > refMax)
            {
                refMax = sum;
                reflevel = level;
            }
            level = level+1;
        }
        return reflevel;
    }
}