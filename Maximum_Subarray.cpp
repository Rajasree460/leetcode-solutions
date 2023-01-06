class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n=nums.size();
        long long currsum=0,maxsum=INT_MIN;
        for(int i:nums){ //i=element
            currsum=currsum+i;
            if(currsum>maxsum){
                //maxsum=currsum;
                maxsum=max(maxsum,currsum);

            }
            if(currsum<0) currsum=0;
        }
        return maxsum;
        
    }
};
