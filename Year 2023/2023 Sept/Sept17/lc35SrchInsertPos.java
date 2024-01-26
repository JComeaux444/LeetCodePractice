package Sept17;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int output = 0;
        // if target is less than or is equal to first index return 0
        if (target < nums[0] || target == nums[0]){
            return output;
        }
        // loop as long as index not found
        for (int i = 0; i < nums.length-1; i++) {
            // return index i if target matches
            if (target == nums[i]) {
                return i;
            }
            // return index i+1 if target matches 
            // makes sure next case doesn't mess up
            if (target == nums[i+1]) {
                return i+1;
            }
            // if target can fit between the next 2 indexes, return i + 1
            if (target > nums[i] && target < nums[i+1]) {
                return i+1;
            }



        }      

        // everything else failed so it must fit at the end
        return nums.length;  
        
    }
}