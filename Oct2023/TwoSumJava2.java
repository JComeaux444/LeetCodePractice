class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Create Hashmap
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // making the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i],i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            // find diff between target and nums[i]
            int complement = target - nums[i];
            // if difference is in hashmap and the number isn't i, return [i, difference]
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i , numMap.get(complement)};
            }
        }
        // no solution
        return new int[]{};



        /*
        int fast = 1;
        int slow = 0;
        int[] arr = {0,0};
        while ( slow < nums.length ) {
            if (nums[slow]+nums[fast] == target) {
                arr[0]=slow;
                arr[1]=fast;
                return arr;
            }

            fast++;

            if ( fast >= nums.length ) {
                slow += 1;
                fast = slow+1;
            }

        }
        
        return null;
        */
    }
}