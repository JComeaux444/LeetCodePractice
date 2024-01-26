package Sept12;

class Solution {
    public int majorityElement(int[] nums) {
        // counts how many posAnswer ints there are
        int count = 0;
        // possible correct int
        int posAnswer = 0;

        // For each number in array
        for (int number : nums){
            // if count is 0, make the current number the possible answer
            if (count == 0) {
                posAnswer = number;
            }
            // if the current number is the same as the possible answer, count++
            if (number == posAnswer) {
                count++;
            } else {
                count--;
            }
        }
        
        return posAnswer;
    }
}
