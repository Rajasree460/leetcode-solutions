// class Solution {
//     public int strStr(String haystack, String needle) {
//         return haystack.indexOf(needle, 0); //The indexOf method searches for the specified needle string within the haystack string starting from the specified index.(0)

//     }
// }


class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){  //substring(i,j) it will not include char at jth index.
                return i;
            }
        }
        return -1;
    }
}
