package Nov2023;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int numLen = nums.length;
        int[] ans = new int[numLen*2];
        for (int i = 0; i < numLen; i++) {
            ans[i] = nums[i];
            ans[i+numLen] = nums[i];
        }


        return ans;
    }
}