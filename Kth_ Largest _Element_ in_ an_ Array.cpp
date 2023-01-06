class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        // 1 2 3 4 5 6
        int second_large=nums[n-k];

      return second_large;
    }

};
