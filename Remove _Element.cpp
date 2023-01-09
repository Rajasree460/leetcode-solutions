class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int id=0;
        int n=nums.size();
        while(id<n){
            if(nums[id]==val){
                nums[id]=nums[n-1];
                n--;

            }
            else{
                id++;
            }
        }
        return n;
        }
        
    
};
