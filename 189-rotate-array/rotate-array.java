class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than the array length

        Queue<Integer> Q = new LinkedList<>();

        // Enqueue the last k elements
        for (int i = n - k; i < n; i++) {
            Q.add(nums[i]);
        }

        // Shift the remaining elements to make space for rotated elements
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Dequeue and put the rotated elements at the beginning
        for (int i = 0; i < k; i++) {
            nums[i] = Q.remove();
        }
    }
}