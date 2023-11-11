package Nov2023;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // list of most frequent numbers
        int[] answer = new int[k];
        // Hashmap 
        HashMap<Integer, Integer> count = new HashMap<>();
        
        // for each number in nums, keep track of freq
        for (int num : nums) {
            // if num is in count, add one to value. otherwise add to count map
            if (count.containsKey(num)) {
                int oldval = count.get(num);
                count.replace(num, oldval, oldval+1);
            } else {
                count.put(num,1);
            }
        }
        // bucket sort list
        List<Integer> bucket[] = new ArrayList[nums.length+1];
        // for every key in count map
        for (int key : count.keySet()) {
            // find the keys value (frequency)
            int frequency = count.get(key);
            // if the bucket hasn't encountered the value, create a new list 
            // that will hold every number with the same frequency
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            // add the key to the frequency position 
            bucket[frequency].add(key);
        }
        // index for answer array, starting at 0 (highest common number)
        int index = 0;
        // from the back of the bucket (Highest numbers)
        for (int i = bucket.length-1; i >= 0; i--) {
            // check if position is not empty
            if (bucket[i] != null) {
                // for each number at this bucket index
                for (int value : bucket[i]) {
                    // assign the number to the result array and itterate index
                    answer[index++] = value;
                    // if the index get to k, return the answer/result array
                    if (index == k) {
                        return answer;
                    }
                }
            }
        }
        
        // return answer array since it is as full as it will get.
        return answer;
    }
}