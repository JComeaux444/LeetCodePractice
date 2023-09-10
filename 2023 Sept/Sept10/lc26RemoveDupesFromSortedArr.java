package Sept10;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        // Goes through the list and if number at i isn't the same as previous,
        // then it will replace number at nums[k], will sort list as it goes 
        // since the last numbers don't matter in this case
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;


        /* Works but can be done better
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                nums[i-1] = 300;
            } else {
                k++;
            }
        }

        Arrays.sort(nums);
        return k;
        */
    }
}
