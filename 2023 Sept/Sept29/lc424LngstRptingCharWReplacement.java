package Sept29;

class Solution {
    public int characterReplacement(String s, int k) {
        /*
        We basically need to find the longest sliding window size
        that contains a single letter. 

        We are also given k which lets us replace k amount of letters
        into whatever we want

        Meaning: We are looking for the biggest size when 
        end-start+1 -maxCount > k (Meaning everything is/can be one char)
        */

        // longest window
        int longest = 0;
        //start of window
        int start = 0;
        // largest count of unique char in current window size
        int maxCount = 0;
        // Alphabet array
        int[] count = new int[26];

        // for the length of the string
        for (int i = 0; i < s.length(); i++) {
            // maxCounts' highest is either itself or the number at this arrays' index point
            maxCount = Math.max(maxCount, ++count[s.charAt(i) - 'A']);
            // Check if window size is fits with k replacements allowed
            if (i - start + 1 - maxCount > k) {
                // removes count (by one) at start of window
                count[s.charAt(start)-'A']--;
                // Move start position forward
                start++;
            }
            // find biggest window size
            longest = Math.max(longest, i - start + 1);

        }
        //return window size
        return longest;
        
    }
}