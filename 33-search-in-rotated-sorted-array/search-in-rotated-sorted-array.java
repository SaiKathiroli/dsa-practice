class Solution {
    public int search(int[] nums, int target) 
    {
        int low=0;
        int high=nums.length-1;
        int result=-1;
        while(low<=high)
        {
            int mid = high+(low-high)/2;
            if(nums[mid] == target)
            {
                result = mid;
                break;
            }
            // check if the left part is sorted
            if(nums[low] <= nums[mid])
            {
                // check if there is a possibility that the target exists here
                if(nums[low] <= target && target<=nums[mid])
                {
                    high=mid-1;
                }
                else low = mid+1;
            }
            else
            {
                // check if there is a possibility that the target exists here
                if(target <= nums[high] && nums[mid] <= target)
                {
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return result;
    }
}