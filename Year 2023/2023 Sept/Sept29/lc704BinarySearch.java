package Sept29;

class Solution {
    public int search(int[] nums, int target) {
        // Left pointer
        int left = 0;
        // Right pointer
        int right = nums.length - 1;

        // Loop continues until left pointer is greater than right pointer
        while (left <= right) {
            // find mid point of array
            int mid = left + (right - left) / 2;
            // if mid index is target number, return index
            if (nums[mid] == target) {
                return mid;
                // If mid number is less than target, move left pointer to mid+1
            } else if (nums[mid] < target) {
                left = mid + 1;
                // otherwise mid is greater, so move right to mid -1
            } else {
                right = mid - 1;
            }
        }
        // target on in array so return -1
        return -1;
        
    }
}