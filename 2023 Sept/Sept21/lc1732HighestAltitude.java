package Sept21;

class Solution {
    public int largestAltitude(int[] gain) {
        // need sum to add all gains, max to keep to highest number
        int sum = 0;
        int max = 0;
        // add each num to sum and if sum > max then max = sum
        for (int num : gain) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}