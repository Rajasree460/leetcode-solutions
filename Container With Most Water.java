class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            // Math.min(height[left], height[right]): This part calculates the height of the
            // rectangle. It chooses the smaller of the two heights of the lines at indices
            // left and right. This is because the area of the rectangle is limited by the
            // shorter of the two lines, as pouring water beyond the shorter line would
            // result in overflow. --height

            // (right - left): This part calculates the width of the rectangle. It's the
            // difference between the indices of the lines, representing the distance
            // between them on the x-axis. This width represents the base of the
            // rectangle.-- base

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
