class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i=0;
        int j=0;
        for(i=m;i<nums1.length;i++)
        {
            nums1[i] = nums2[j];
            j = j+1;
        }
        Arrays.sort(nums1);
    }
}