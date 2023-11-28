class Solution {
    public int maxArea(int[] height) 
    {
        int n = height.length;
        int max = Integer.MIN_VALUE;

        int l=0;
        int r = n-1;

        while(l<r)
        {
            int vol = (r-l)*Math.min(height[l],height[r]);
            if(vol>=max) max = vol;
            if(height[l] > height[r]) r=r-1;
            else l=l+1;
        }
        return max;
    }
}