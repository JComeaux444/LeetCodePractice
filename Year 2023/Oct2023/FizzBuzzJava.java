//LC 412 
class Solution {
    public List<String> fizzBuzz(int n) {
        // make list to store the answers
        List<String> answer = new ArrayList<>();

        // for each number up to and equal to n
        for (int i = 1; i <= n; i++) {
            // check if i is divisible by both 3 and 5
            if (i%3==0 && i%5==0) {
                answer.add("FizzBuzz");
            // check if i can be divided by only 3
            } else if (i%3==0) {
                answer.add("Fizz");
            // see if i can be divided by 5
            } else if (i%5==0) {
                answer.add("Buzz");
            // if nothing else was true return i as a string
            } else {
                answer.add(String.valueOf(i));
            }
        }
        // return the list of answers
        return answer;
        
    }
}