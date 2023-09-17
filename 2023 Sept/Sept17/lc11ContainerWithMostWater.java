package Sept17;

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;

        while (left < right) {
            int width = right-left;
            int hgt = Math.min(height[left], height[right]);
            int area = hgt * width;
            max = Math.max(max, area);

            // Main part is here
            // if the left height is smaller than right, most left pointer right one
            // second case is opposite, if right pointer smaller, move it over left
            // otherwise they are the same, move them both closer to center
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }

        }

        return max;
        
        /* Works but too slow for site
        int max = 0;
        for (int i = 0; i <= height.length-1; i++) {
            for (int j = height.length-1; j > i; j--) {
                int distance = j-i;
                if (height[i] <= height[j]) {
                    max = maxCheck(height[i]*distance,max);
                } else {
                    max = maxCheck(height[j]*distance,max);
                }
            }
        }

        return max;
        */
    }

    /* Works but too slow for site
    public int maxCheck (int x, int currMax) {
        if (x > currMax) {
            return x;
        } else {
            return currMax;
        }
    }
    */
}