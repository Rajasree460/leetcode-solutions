class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();  //taking resultant string
        Arrays.sort(v);
        String first = v[0]; 
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();  //returning empty string
            }
            ans.append(first.charAt(i));  //appending common prefix 1 by 1 
        }
        return ans.toString();  //returning final result
    }
}
