package Sept17;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int output = 0;
        if (target < nums[0] || target == nums[0]){
            return output;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (target == nums[i]) {
                return i;
            }
            if (target == nums[i+1]) {
                return i+1;
            }
            if (target > nums[i] && target < nums[i+1]) {
                return i+1;
            }



        }      

        return nums.length;  
        
    }
}