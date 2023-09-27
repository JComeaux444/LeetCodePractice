package Sept26;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // For each letter
        for (char letter : letters) {
            // Check if letter is greater than target
            if (letter > target) {
                // if true return the letter
                return letter;
            }
        }
        // Return first letter as none are greater than target
        return letters[0];
    }
}