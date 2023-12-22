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
    public int deepestLeavesSum(TreeNode root) 
    {
        Queue<TreeNode> qk = new LinkedList<>();
        qk.add(root);
        int max = 0;
        while(!qk.isEmpty())
        {
            int count = qk.size();
            max = 0;
            while(count != 0)
            {
                TreeNode X = qk.remove();
                max = max + X.val;
                if(X.left != null) qk.add(X.left);
                if(X.right != null) qk.add(X.right);
                count = count-1;
            }
        }
        return max;
    }
}