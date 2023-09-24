package Sept22;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // define total sum
        double totalSum = 0.0;

        // add all numbers upto index k (window)
        for (int i = 0 ; i < k; i++) {
            totalSum += nums[i];
        }
        // current max of the window
        double max = totalSum;

        // start at index k 
        // then we move up by one
        for (int i = k; i < nums.length; i++) {
            // add the new num at index, and remove num at index leaving the window
            totalSum += nums[i] - nums[i-k];
            // find new max, compare window max with highest max found so far
            max = Math.max(max, totalSum);
        }
        // return max divided by window size k
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