package Sept12;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        //for each position in the haystack
        for ( int i = 0; i <= (haystack.length() - needle.length()); i++ ) {
            int j = 0;
            // we check if each position of the needle lines up with the haystack
            while (j < needle.length() && haystack.charAt(i+j) == needle.charAt(j)) {
                j++;
            }
            // if the needle lines up with the characters in the stack
            // then we found the index of the needle
            if (j == needle.length()) {
                return i;
            }

        }
        return -1;
        
    }
}