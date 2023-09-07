package Sept6;
// Wants it log n which this technically isn't, can add a check along to way to see if
// 3 is in [88,89,1,2,4,5,... inf] so it doesn't run as O(n) 
public class Solution {
    public int search(int[] nums, int target) {
        int position = -1;
        for ( int i = 0; i < nums.length; i++ ) {
            if (nums[i]==target){
                position = i;
            }
        }
        return position;
    }
}