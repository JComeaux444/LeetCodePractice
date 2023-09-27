package Sept26;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //count of how many jewels are in stones string
        int jCount = 0;
        // for the length of stone
        for (int i = 0; i < stones.length(); i++) {
            // check if stone[i] is in jewels, if so count up
            //we have ""+ since it turns the single char into a char sequence
            // can also use Character.toString(c)
            if ( jewels.contains(""+stones.charAt(i)) ) {
                jCount++;
            }
        }
        //return the count
        return jCount;
        
    }
}