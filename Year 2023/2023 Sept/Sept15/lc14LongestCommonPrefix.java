package Sept15;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // longest string answer possible is 200
        // so if answer is 300 at the end we know that nothing matched correctly
        int answer = 300;

        // strs of lngth 1 is minimum, and won't be checked, hence return the only option
        if (strs.length == 1) {
            return strs[0];
        }
        
        // for each string in the array
        for (int i = 1; i < strs.length; i++) {
            // used to count if current and previous string chars match at j
            int sameChar = 0;
            // we don't want out of bounds errors so we use this to check first
            int limit = 0;
            if (strs[i].length() <= strs[0].length()) {
                limit = strs[i].length();
            } else {
                limit = strs[0].length();
            }
            // we then check each char in both strings wer are using and compare
            for (int j = 0; j < limit; j++) {
                if (strs[i].charAt(j) == strs[0].charAt(j)) {
                    sameChar++;
                } else {
                    // break here since we are no longer a prefix
                    // otherwise flozzzz and fixzzzz would have a 'large prefix'
                    break;
                }
            }
            // We want the smallest prefix size at this point
            // since it would be the longest COMMON prefix on all strings
            // Might be useless in if block now, due to changes above.
            if (sameChar < answer) {
                answer = sameChar;
            }

        }
        // if answer is 300 we know the above never ran since it never met conditions
        // so we know zero as answer is correct, empty list
        if (answer == 300) {
            answer = 0;
        }

        return strs[0].substring(0,answer);
        
    }
}