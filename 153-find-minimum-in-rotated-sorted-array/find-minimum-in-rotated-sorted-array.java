class Solution {
    public int findMin(int[] nums) 
    {
        int low=0;
        int high=nums.length-1;
        int result=Integer.MAX_VALUE;
        if(nums[low] <= nums[high])
        {
            result = nums[low];
        }
        else {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                result = Math.min(nums[mid], result);
                if (nums[low] <= nums[mid]) {
                    result = Math.min(nums[low], result);
                    low = mid + 1;
                } else {
                    result = Math.min(nums[mid], result);
                    high = mid - 1;
                }
            }
        }
        return result;
    }
}