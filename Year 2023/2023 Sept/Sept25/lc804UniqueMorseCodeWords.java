package Sept25;

import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        // Morse code given from a-b
        String[] morse = {".-","-...","-.-.","-..",".",
                        "..-.","--.","....","..",".---",
                        "-.-",".-..","--","-.","---",".--.",
                        "--.-",".-.","...","-","..-","...-",
                        ".--","-..-","-.--","--.."};
        // HashSet to keep track of each unique morse code string
        HashSet<String> morseSet= new HashSet<>();
        // go through each word
        for (String word: words) {
            // create new string builder that will house the new morse code verson of the word
            StringBuilder morsedWord = new StringBuilder();
            //for each letter in the word
            for (int i = 0; i < word.length(); i++) {
                // append the morse code equivalant to the new morse word
                morsedWord.append(morse[word.charAt(i)-'a']);
                // the -'a' will give you the position of the char
                // in the morse set and in basic ASCII.
                // a-a = 0,  b-a = 1, c-a=2 ... etc
            }
            // add the stringified version of the morse word to the set
            morseSet.add(morsedWord.toString());
        }
        // return length of morse set, as each key is a unique morse code word
        return morseSet.size();
        
    }
}