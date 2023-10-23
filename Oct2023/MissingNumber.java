class Solution {
    public int missingNumber(int[] nums) {

        int length = nums.length;
        int sum = length*(length+1) / 2;

        for (int i = 0; i < length; i++) {
            sum -= nums[i];
        }

        return sum;
        // Works but can be made simpler, XOR, SUM, BinSrch
        /*
        int n = nums.length;
        int[] numList = new int[nums.length+1];
        for (int i = 0; i < n+1; i++) {
            numList[i] = i;
        }
        //System.out.println(Arrays.toString(numList));

        for (int i = 0; i < n; i++) {
            numList[nums[i]] += 1;
        }
        //System.out.println(Arrays.toString(numList));
        for (int i = 0; i < n; i++) {
            if (numList[i] == i) {
                return numList[i];
            }
        }
        

        return n;
        */
    }
}