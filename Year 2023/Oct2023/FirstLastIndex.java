// lc 34, daily question oct 8
class Solution {
    public int[] searchRange(int[] nums, int target) {
        // create the array we will return
        int[] answer = new int[]{-1,-1};
        // initalize left and right
        int left = 0;
        int right = nums.length-1;

        // make sure nums is long enough to be used and 
        // make sure there is a chance target is in it
        // otherwise return default array
        if (nums.length < 1 || nums[0] > target) {
            return answer;
        }

        // use find method (Binary Search) to find first position of target
        left = find(target,left,right,nums);
        // this one will find last position of it!
        // find the first position of target+1 (Even if it doesn't exist)
        // and return the index to the left. 
        // starts at first pos of target so it's quick
        right = find(target+1,left,right,nums)-1;

        // last check, make sure if left index is higher than array size 
        // or if the index isn't the target number,
        // just return default answer as target doesn't exist
        if (left > nums.length-1 || nums[left] != target) {
            return answer;
        }

        // finally insert left and right indexes
        answer[0] = left;
        answer[1] = right;
        // return the answer array
        return answer;
    }

    public int find(int target, int left, int right, int[] nums) {
        //while left doesn't go over right index
        while (left <= right) {
            // find middle at between left and right
            int mid = (left + right)/2;
            // if target is bigger than middle index number
            // move left up to middle+1
            if (target > nums[mid]) {
                left = mid+1;

            // if target is not bigger than middle index number
            // move right up to middle-1
            } else {
                right = mid-1;
            }
        }
        // return the left position
        return left;

        // it is checked later to make sure the index is correct
    }
}