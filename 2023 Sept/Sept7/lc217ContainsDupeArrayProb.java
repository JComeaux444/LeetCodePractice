package Sept7;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if ( !seen.contains(nums[i]) ) {
                seen.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}