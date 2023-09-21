package Sept21;

class Solution {
    public int removeDuplicates(int[] nums) {
 
        // counts dupes
        int numCount = 1;
        // stays at a position where past two nums are dupes
        int slowPointer = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                // only if we aren't over 2, do we move the delayed pointer, 
                // to add the current number
                if (numCount < 2) {
                    nums[slowPointer++] = nums[i];
                }  
                numCount++;
            } else {
                numCount = 1;
                // since the number is different we can add the 
                // current number to the delayed position
                nums[slowPointer++] = nums[i];
            }
        }

        return slowPointer;
        
    }
}