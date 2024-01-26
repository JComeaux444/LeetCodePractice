package Nov2023;

import java.util.PriorityQueue;

class KthLargest {
    // Create the queue we will use
    PriorityQueue<Integer> pq;
    // keep track of the size of queue it wants to be
    int k = 0;

    public KthLargest(int k, int[] nums) {
        // make k the k given by user
        this.k = k;
        // instanciate the queue
        pq = new PriorityQueue<>();
        // for each item in the given array add them to the queue
        for (int i: nums) {
            this.add(i);
        }
    }
    
    public int add(int val) {
        // we add the given int value to the queue
        pq.add(val);
        // if the queue size is greater than k, remove smallest number
        // if incoming num is smaller it will be removed before being peeked
        if (pq.size() > k) {
            pq.remove();
        }
        // return smallest number in the queue
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
