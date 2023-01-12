class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        for(int i=1;i<=n;i++){
            nums.push_back(i);
        }
        int res=0;
        int l=nums.size();
        for(int i=0;i<l;i++){
            res^=nums[i];
        }
        return res;
    }
};
