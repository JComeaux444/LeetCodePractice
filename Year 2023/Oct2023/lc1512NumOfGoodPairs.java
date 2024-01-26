package Oct2023;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        // Need to return a int of amount of pairs
        int count = 0;
        // for each position of nums
        for (int i = 0; i < nums.length; i++) {
            // go to the end and compare both int at those positions
            // as long as j is bigger than i
            for (int j = nums.length-1; i < j; j --) {
                // if both the numbers are the same,
                // increment count by one 
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
