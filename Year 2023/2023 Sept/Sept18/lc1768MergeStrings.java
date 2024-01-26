package Sept18;

class Solution {
    public String mergeAlternately(String word1, String word2) {

        int max = 0;
        //empty string to append everything to
        String word3 = "";
        // find longest string to stop at.
        if (word1.length() > word2.length()) {
            max = word1.length();
        } else {
            max = word2.length();
        }

        // append each letter to new string
        for (int i = 0; i < max; i++ ) {
            if (word1.length() > i) {
                word3 += word1.charAt(i);
            }
            if (word2.length() > i) {
                word3 += word2.charAt(i);
            }
        }
        
        return word3;
    }
}