class Solution {
public:
    int singleNumber(vector<int>& nums) {
      unordered_map<int,int>mp;
      for(int i:nums){
          ++mp[i];
      }
     for(auto it:mp){
         if(it.second==1)
         return it.first;
     }
     return 0; //if nothig has to be returned then return 0 or -1
    }
};
