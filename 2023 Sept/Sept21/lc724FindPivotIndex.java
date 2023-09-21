package Sept21;

class Solution {
    public int pivotIndex(int[] nums) {

        int sum = 0;
        int sumLeft = 0;
        // add all nums to sum
        for (int num : nums) {
            sum += num;
        }
        // check if each left sum is same as total sum minus current position
        for (int i = 0; i < nums.length; i++) {
            // EX: {2,1,-1} -> 0*2 == 2-2
            if (sumLeft*2 == sum-nums[i]) {
                return i;
            }
            // add current num to leftsum after since we need to start at zero
            sumLeft += nums[i];
        }

        return -1;
    }
}