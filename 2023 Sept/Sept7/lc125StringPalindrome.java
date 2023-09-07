package Sept7;

class Solution {
    public boolean isPalindrome(String s) {
        // Basically lc9 but clean input to only have alphanumeric chars
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        System.out.println(s);
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