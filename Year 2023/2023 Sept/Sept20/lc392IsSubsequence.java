package Sept20;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }

        String tReduced = "";
        int sPosition = 0;

        for (int i = 0; i < t.length(); i++) {
            // Makes sure position isn't going out of bounds
            //only adds char if it is in both strings
            if ( sPosition < s.length() && t.charAt(i) == s.charAt(sPosition) ) {
                tReduced += t.charAt(i);
                sPosition++;
            }

        }
        //System.out.println(tReduced);

        //checks if they are the same
        // can also check length 
        if ( tReduced.contains(s) ) {
            return true;
        }
        
        return false;
    }
}