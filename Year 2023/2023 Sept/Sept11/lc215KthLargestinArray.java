package Sept11;

class Solution {
    // Got stuck for a while thinking of other solutions
    public int findKthLargest(int[] nums, int k) {
        // Good but slower than simple one
        PriorityQueue<Integer> bigK = new PriorityQueue<Integer>(k + 1);
    
        for(int element : nums) {
            bigK.add(element);
            if (bigK.size() > k) {
                bigK.poll();
            }
        }
        
        return bigK.poll();
        
        /* Works but too easy and shows nothing, faster than heap though
        Arrays.sort(nums);
        return nums[nums.length-k];
        */
    }
}
