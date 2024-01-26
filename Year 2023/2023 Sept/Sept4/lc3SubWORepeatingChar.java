package Sept4;

public class lc3SubWORepeatingChar {
    /*

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int slow = 0;
        int fast = 0;

        // Will make sure no substring has dupes
        Set<Character> set = new HashSet<>();

        while (fast < s.length() ) {
            if (!set.contains(s.charAt(fast))) {
                // Set doesn't have this char, so add it to set and increment
                set.add(s.charAt(fast++));
                // finds Max out of longest and the set size
                longest = Math.max(longest, set.size());
            } else {
                // Does have this char, so remove first char, and increment
                set.remove(s.charAt(slow++));
            }

        }
    
        return longest;

        
    }
}

     * 
     */
}
