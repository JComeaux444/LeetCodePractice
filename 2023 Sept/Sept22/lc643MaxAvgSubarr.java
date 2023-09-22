package Sept22;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double totalSum = 0.0;

        for (int i = 0 ; i < k; i++) {
            totalSum += nums[i];
        }
        double max = totalSum;

        for (int i = k; i < nums.length; i++) {
            totalSum += nums[i] - nums[i-k];
            max = Math.max(max, totalSum);
        }

        return max / k;


        /* Works but Time Limit Exceeded 
        double max = -999999.0;

        for (int i = 0; i <= nums.length-k; i++) {
            
            double sum = 0.0;

            for (int j = 0; j < k; j++) {
                sum += nums[i+j];
            }

            sum = sum/k;
            //System.out.println(sum);
            //System.out.println(max);
            if (sum > max) {
                max = sum;
                //System.out.println(max);
            }
        }

        return max;
        */
    }
}