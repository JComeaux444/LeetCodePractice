package Sept13;

class Solution {
    public int lengthOfLastWord(String s) {
        //boolean isSpace = false;
        int length = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && length > 0) {
                break;
            } else if (s.charAt(i) != ' ') {
                length++;
            }
        }

        return length;
        
    }
}