/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int[] finder(int[] nums,int sI,int eI)
    {
        int max = -1;
        int index = -1;
        for(int i=sI;i<=eI;i++)
        {
            if(nums[i] >= max)
            {
                max = nums[i];
                index = i;
            }
        }
        int[] ret = new int[2];
        ret[0] = max;
        ret[1] = index;
        return ret;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) 
    {
        int[] ans = finder(nums,0,nums.length-1);
        TreeNode root = new TreeNode(ans[0]);
        if(ans[1]-1 >= 0)
        {
        root.left = constructTwo(nums,0,ans[1]-1);
        }
        if(ans[1]+1 <= nums.length-1)
        {
        root.right = constructTwo(nums,ans[1]+1,nums.length-1);
        }
        return root;
    }

    public TreeNode constructTwo(int[] nums,int sI,int eI)
    {
        int[] ans  = finder(nums,sI,eI);
        TreeNode rt = new TreeNode(ans[0]);
        if(ans[1]-1 >= sI)
        {
            rt.left = constructTwo(nums,sI,ans[1]-1);
        }
        if(ans[1]+1 <= eI)
        {
            rt.right = constructTwo(nums,ans[1]+1,eI);
        }
        return rt;
    }
}