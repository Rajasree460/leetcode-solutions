class Solution {
    public int findNumbers(int[] nums) {
        
        int ct=0;
        
        for(int i =0 ; i< nums.length; i++){
            
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                ct++;
            }
        }
        
        return ct;
        
    }
}
