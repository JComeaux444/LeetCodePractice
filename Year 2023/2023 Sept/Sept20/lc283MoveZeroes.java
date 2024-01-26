package Sept20;

class Solution {
    public void moveZeroes(int[] nums) {

        int position = 0;
        // each number that isn't zero, gets pushed to front
        for (int num : nums) {
            if (num != 0) {
                nums[position++] = num;
            }
        }
        // fill in last spaces with zeros
        while (position < nums.length) {
            nums[position++] = 0;
        }

        /* Works but is BigO n^2
        int temp = 0;
        for (int x = 0; x < nums.length; x++) {

            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i]==0) {
                    temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                    
                }
            }

        }
        */
    }
}