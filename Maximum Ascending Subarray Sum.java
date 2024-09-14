class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];  // Initialize maxSum with the first element
        int currSum = nums[0];  // Initialize currSum with the first element
        
        for (int i = 1; i < nums.length; i++) {
            // If the current element is larger than the previous one, continue the subarray
            if (nums[i] > nums[i - 1]) {
                currSum += nums[i];  // Add current element to the current sum
            } else {
                currSum = nums[i];   // Reset the current sum to the current element
            }
            // Update maxSum with the maximum of maxSum and currSum
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
}
