class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}



// Example 1: nums = [1, 3, 5, 6], target = 5
// Initial: left = 0, right = 3
// Loop 1: mid = 1, nums[mid] = 3 (3 < 5, so update left = 2)
// Loop 2: mid = 2, nums[mid] = 5 (5 == 5, return 2)
// Example 2: nums = [1, 3, 5, 6], target = 2
// Initial: left = 0, right = 3
// Loop 1: mid = 1, nums[mid] = 3 (3 > 2, so update right = 0)
// Loop 2: mid = 0, nums[mid] = 1 (1 < 2, so update left = 1)
// Exit Loop: Return left = 1
// Example 3: nums = [1, 3, 5, 6], target = 7
// Initial: left = 0, right = 3
// Loop 1: mid = 1, nums[mid] = 3 (3 < 7, so update left = 2)
// Loop 2: mid = 2, nums[mid] = 5 (5 < 7, so update left = 3)
// Loop 3: mid = 3, nums[mid] = 6 (6 < 7, so update left = 4)
// Exit Loop: Return left = 4
// Time Complexity
// The time complexity is 
// 𝑂
// (
// log
// ⁡
// 𝑛
// )
// O(logn) as using binary search.
