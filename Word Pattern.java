import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Split the string `s` into words
        String[] words = s.split(" ");
        
        // Check if the number of words matches the number of characters in pattern
        if (pattern.length() != words.length) {
            return false;
        }
        
        // Create two hash maps for mapping pattern -> word and word -> pattern
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            // Check if there's already a mapping from pattern character to a word
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;  // Mismatch in mapping
                }
            } else {
                charToWord.put(c, word);
            }
            
            // Check if there's already a mapping from word to a pattern character
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false;  // Mismatch in mapping
                }
            } else {
                wordToChar.put(word, c);
            }
        }
        
        return true;  // All mappings are consistent
    }
}
