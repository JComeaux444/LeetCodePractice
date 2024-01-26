package Sept18;

class Solution {
    public int[] plusOne(int[] digits) {
        // create bigger array just in case current array is 999...
        int[] newArr = new int[digits.length+1];
        // we add one to last digit
        digits[digits.length-1] += 1; 
        // if last digit is not 10 then return array
        if (digits[digits.length-1] <= 9) {
            return digits;
        }


        //create a carry int
        int carry = 1;

        // for each element we check if its 9 or more, change it to 0
        // otherwise we add one and finish the loop
        for (int i = digits.length-1; i >= 0; i--) {
            if (carry == 0) {
                break;
            }
            if (digits[i] >= 9) {
                digits[i] = 0;
            } else {
                digits[i] += carry;
                carry--;
            }
            newArr[i+1] = digits[i];
        }
        //if first digit is 0 then we went over the limited space
        // return new array with 1 at index 0
        if (digits[0] == 0) {
            newArr[0] = 1;
            return newArr;
        }

        //othwerwise return digit array as is
        return digits;
        
    }
}