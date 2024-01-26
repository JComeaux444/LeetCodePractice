package Sept7;

class Solution {
    public boolean isPalindrome(int x) {
        // converted to string
        String s = String.valueOf(x);
        // string length
        int len = s.length(); 

        for (int i = 0; i < len/2; i++) {
            // if char at i isn't equal to the other side of the string, its false
            if (s.charAt(i) != s.charAt(len - i - 1)){
                return false;
            }
        }
        // otherwise it's true
        return true;
    }
}