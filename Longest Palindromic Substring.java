public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s; // if 1 char then it's palindrome itself
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1); // to extract the part of the string

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) { // starting from the current character (i), iterates over all
                                                              // possible substrings starting from i and ending at the end
                                                              // of the string s.
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) { // it checks if the current substring (from
                                                                         // index i to j) is a palindrome and if its
                                                                         // length is greater than the current maxLen.
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                    // updates maxLen with the length of the current substring and maxStr with the
                    // current substring itself
                }
            }
        }
        return maxStr;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // if doesn't match return false
            }
            // otherwise update pointers
            left++;
            right--;
        }

        return true;
    }
}
