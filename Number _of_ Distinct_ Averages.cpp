#define s(a) sort(nums.begin(),nums.end())

class Solution {
public:
    int distinctAverages(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        int stt=0,edd=n-1;
         map<double,int>mp;
        while(stt<edd){
            double mid=(double)(nums[stt]+nums[edd])/2;
            mp[mid]++;
            stt++;
            edd--;
        }
        return mp.size();
    }
};
