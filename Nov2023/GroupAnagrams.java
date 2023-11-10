package Nov2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // length of incoming string array
        int strLen = strs.length;
        // the list of each list of anagrams 
        List<List<String>> answer = new ArrayList<>(); 
        // HasMap of each unique sorted string (anagram)
        HashMap<String, Integer> uniqueSet = new HashMap<>(); 

        // will go through each string in strs array 
        for (int i = 0; i < strLen; i++) {
            // convert string to char array so you can sort it
            char temp[] = strs[i].toCharArray();
            // sort char array
            Arrays.sort(temp);
            // make the char array into a string
            String tempString = new String(temp);

            // use the string as key in hashmap, and make value the size of map
            // only will happen if key isn't in map, and size method is one int
            // bigger than it is, hence will always "append" key to end
            uniqueSet.putIfAbsent(tempString,uniqueSet.size());

            // index of which list in the list, to append the word into. 
            // To group the anagrams
            int index = uniqueSet.get(tempString);

            //System.out.println(answer.size());
            //System.out.println(index);

            // if index is out of bounds, it's a new anagram so we append to the 
            // outer list, creating a new grouping
            if (answer.size() <= index) {
                List<String> startList = new ArrayList<>();
                //add string to the list
                startList.add(strs[i]);
                //add new list into outer list (new anagram)
                answer.add(startList);
            } else {
                // add new word to inner list
                answer.get(index).add(strs[i]);
            }
            
        }

        //System.out.println(Arrays.toString(sortedStr));
        //System.out.println(uniqueSet);

        return answer;
    }
}
