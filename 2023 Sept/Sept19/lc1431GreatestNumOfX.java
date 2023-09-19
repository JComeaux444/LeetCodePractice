package Sept19;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Create boolean list
        List<Boolean> boList = new ArrayList <> ();
        // int to keep track of highest int
        int greatest = 0;
        // find highest int
        for (int i = 0; i < candies.length; i++) {
            if (greatest < candies[i]) {
                greatest = candies[i];
            }
        }
        // for each element, if int at i plus extra is greatest or more, true, else false.
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= greatest) {
                boList.add(true);
            } else {
                boList.add(false);
            }
        }






        return boList;
    }
}