class Solution {
    public int trap(int[] height) {
        int maxwater=0;
        int left=0;
        int right=height.length-1;
        int leftmax=height[left];
        int rightmax=height[right];

        while(left<right){
            if(leftmax<rightmax){
               left++;
               leftmax=Math.max(leftmax,height[left]);
               maxwater+=leftmax-height[left];
            }else{
                right--;
               rightmax=Math.max(rightmax,height[right]);
               maxwater+=rightmax-height[right];
            }
        }
        return maxwater;
    }
}
