class Solution {
    public int largestRectangleArea(int[] heights) {
        // Monotonic Stack Approach
        // We maintain values in the stack in the non-decreasing order
        Deque<Integer> stack = new ArrayDeque<>();
        // If there is only one element in the stack,
        // it means this is the lowest value up to now
        // so the corresponding rectangle should be extended to the leftmost
        // In this case, we always keep a virtual index -1 as the "ultimate left bound" 
        stack.offerFirst(-1);
        int ans = 0, n = heights.length;
        for (int i = 0; i < n; i++) {
            while (stack.peekFirst() != -1 && heights[stack.peekFirst()] > heights[i]) {
                // i is the index which points to a lower value
                // which becomes the "right bound" of the current value (exclusive)
                int ind = stack.pollFirst();
                // Since the values in the monotonic stack are non-decreasing,
                // the new top of the stack is its own "left bound" (exclusive)
                ans = Math.max(ans, heights[ind] * (i - stack.peekFirst() - 1));
            }
            stack.offerFirst(i);
        }
        int right = n;
        while (stack.peekFirst() != -1) {
            int ind = stack.pollFirst();
            ans = Math.max(ans, heights[ind] * (right - stack.peekFirst() - 1));
        }
        return ans;
    }
}
