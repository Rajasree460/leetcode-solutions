import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // First, count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Second, find the index of the first character that appears only once
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;  // Return the index of the first unique character
            }
        }
        
        return -1;  // Return -1 if no unique character is found
    }
}
