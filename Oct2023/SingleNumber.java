class Solution {
    public int singleNumber(int[] nums) {
        // answer int 
        int answer = 0;
        // for each element in nums
        for (int i:nums) {
            // uses XOR to see which number is only in array once
            answer = answer ^ i;
        }
        // returns final answer
        return answer;
    }
}