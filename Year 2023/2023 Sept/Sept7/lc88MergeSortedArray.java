package Sept7;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // last real elements of the arrays (not zero fillers)
        int i = m-1;
        int j = n-1;
        // Last index of nums1
        int k = m+n-1;

        // while you aren't done sorting through either list
        while (i >= 0 && j >= 0){
            // if ar1[i] is bigger or equal to ar2[j] 
            // put ar1[i] at the end of ar1. decrease i 
            if (nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                // like above but decrease j if ar2[j] was bigger
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        // We can do one of these since one of the arrays is already finished being sorted
        // If i isn't zero yet
        while ( i >= 0) nums1[k--] = nums1[i--];
        // If j isn't zero yet
        while ( j >= 0) nums1[k--] = nums2[j--];

    }
}


/*  This works but can make one without using built in sort 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = 0; i+m < nums1.length; i++){
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1); 
        //return nums1;


    }
}
*/