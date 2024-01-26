package Sept4;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int fast = 1;
        int slow = 0;
        int[] arr = {0,0};
        while ( slow < nums.length ) {
            if (nums[slow]+nums[fast] == target) {
                arr[0]=slow;
                arr[1]=fast;
                return arr;
            }

            fast++;

            if ( fast >= nums.length ) {
                slow += 1;
                fast = slow+1;
            }

        }
        
        return null;
    }
}