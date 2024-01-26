package Sept6;


class Solution {
    public int maxProfit(int[] prices) {
        

        int lowestPos = prices[0];
        int profit = 0;
        
        // if array is to small returns 0
        if (prices.length<2) return 0;

        for (int i = 1; i < prices.length; i++) {

            // Get min price
            lowestPos = Math.min(lowestPos, prices[i]);
            // Finds max profit, will always be the greatest
            profit = Math.max(profit, prices[i] - lowestPos);
           
        }
        
        
        
        return profit;
     

    }
}

/* This works but will time out at large data sets
 * class Solution {
    public int maxProfit(int[] prices) {
        
        int lowestPos = 0;
        int highestPos = 1;
        
        int fast = 1;
        int slow = 0;

        while (slow < prices.length) {

            while (fast < prices.length) {

                if ( prices[slow] < prices[fast] && (prices[fast] - prices[slow] ) >= 
                (prices[highestPos] - prices[lowestPos]) ){
                    lowestPos = slow;
                    highestPos = fast;
                    //System.out.println("test");
                }
                fast++;
            }
            //System.out.println("test2");
            slow++;
            fast = slow + 1;
        }
        
        if (prices.length<2)return 0;
        if(prices[highestPos] - prices[lowestPos] > 0) {
            return (prices[highestPos] - prices[lowestPos]);
        } else { return 0; }

    }
}
 */