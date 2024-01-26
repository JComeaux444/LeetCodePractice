package Sept8;

class Solution {
    public int arraySign(int[] nums) {
        int negCount = 0;

        for (int i = 0; i < nums.length;i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0 ) {
                negCount++;
            } 
        }
        if (negCount > 0 && negCount%2 == 1) return -1;
        return 1;


        /*
        // This one sums all numbers and then compares, works but slower
        double sum = nums[0];

        for (int i = 1; i < nums.length;i++) {
            sum *= nums[i];
        }
        System.out.println(sum);
        if(sum < 0){
            return -1;
        } else if (sum > 0){
            return 1;
        }
        return 0;
        */
    }
}