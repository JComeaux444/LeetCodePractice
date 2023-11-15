package Nov2023;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < n*2; i++) {
            if ( i < n ) {
                ans[i*2] = nums[i];
            } else {
                ans[(i-n)*2+1] = nums[i];
            }
        }
        
        return ans;
    }
}