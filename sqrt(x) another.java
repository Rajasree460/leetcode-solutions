class Solution {
    public int mySqrt(int x) {
        // For special cases when x is 0 or 1, return x.
        if (x == 0 || x == 1)
            return x;

        // Initialize the search range for the square root.
        int start = 1;
        int end = x;
        int mid = -1;

        // Perform binary search to find the square root of x.
        while (start <= end) {
            // Calculate the middle point using "start + (end - start) / 2" to avoid integer
            // overflow.
            mid = start + (end - start) / 2;
            // using mid=(start+end)/2; directly might cause an overflow issue, especially when dealing with large values of start and end, to avoid this upper exp has been used

            // If the square of the middle value is greater than x, move the "end" to the
            // left (mid - 1).
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                // If the square of the middle value is equal to x, we found the square root.
                return mid;
            else
                // If the square of the middle value is less than x, move the "start" to the
                // right (mid + 1).
                start = mid + 1;
        }

        // The loop ends when "start" becomes greater than "end", and "end" is the
        // integer value of the square root.
        // However, since we might have been using integer division in the calculations,
        // we round down the value of "end" to the nearest integer to get the correct
        // square root.
        return Math.round(end);
    }
}



/*Initially, start is 3 and end is 4.
Since start is less than or equal to end, the loop continues.
Now, mid is updated to (3 + 4) / 2 = 3, and mid * mid is less than 10.
So, start is updated to mid + 1 = 3 + 1 = 4.
At this point, start becomes equal to end, but the loop still continues because start is not strictly greater than end.
Now, in the next iteration, mid is calculated as (4 + 4) / 2 = 4, and mid * mid equals 16, which is greater than 10.
Therefore, end is updated to mid - 1 = 4 - 1 = 3.
Now, start is greater than end (both are 4), so the loop ends.
In this case, the algorithm stops at end = 3. However, the actual square root of 10 is between 3 and 4. So, end is one less than the actual square root.

Therefore, without rounding end using Math.round(), the function would return 3 as the square root of 10, which is slightly less than the actual square root (which is between 3 and 4). Rounding end ensures that we get the nearest integer approximation to the square root, which in this case would be 3.*/
