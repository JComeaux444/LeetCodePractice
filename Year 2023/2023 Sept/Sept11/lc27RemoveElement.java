package Sept11;

class Solution {
    public int removeElement(int[] nums, int val) {

        int arrayPos = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[arrayPos] = nums[i];
            if (nums[i] != val) {
                arrayPos++;
            }
            
        }
        
        return arrayPos;
    }
}