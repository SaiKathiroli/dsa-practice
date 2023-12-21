class Solution 
{
    public int maxWidthOfVerticalArea(int[][] points) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int[] X:points)
        {
            arr.add(X[0]);
        }
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.size()-2;i++)
        {
            int y = arr.get(i+1) - arr.get(i); 
            max = Math.max(max,y);
        }
        return max;
    }
}