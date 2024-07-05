class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();  // removes extra whitespace from both ends of a string.This method does not change the original string
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        return length;
    }
}
