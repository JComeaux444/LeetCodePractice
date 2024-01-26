package Sept4;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;

        // Will keep track of numbers seen as to not repeat
        Set<Integer> seen = new HashSet<>();

        // Will loop unless n is 1(is happy), or n is seen, stopping since not happy
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);

            // Finds sum of squares for each digit of n
            int sum = 0;
            while (n != 0) {
                int num = n % 10;
                sum += num * num;
                n /= 10;

            }
            // Update new n with sum
            n = sum;
        }
        return n==1;
    }
}
