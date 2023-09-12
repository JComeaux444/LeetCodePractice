package Sept12;

class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] countList = new int[n+1];
        countList[0] = 1;
        countList[1] = 1;

        // basically like pascals triangle, add the previous 2 and continue
        for (int i = 2; i <= n; i++) {
            countList[i] = countList[i-1] + countList[i-2];
        }

        return countList[n];
        
        // using base case and this as recurssion takes too long
        // return climbStairs(n-1) + climbStairs(n-2);
        
    }
}