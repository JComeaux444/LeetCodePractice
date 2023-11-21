package Nov2023;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        for (int i = 0; i < size; i++){
            reverse(image[i]);
            invert(image[i]);
        }

        return image;
    }

    public void reverse( int[] input ){
        int size = input.length;
        for (int i = 0; i < size/2; i++) {
            int temp = input[i];
            input[i] = input[size-i-1];
            input[size-i-1] = temp;
        }
    }

    public void invert( int[] input ){
        int size = input.length;
        for (int i = 0; i < size; i++) {
            if (input[i] == 0){
                input[i] = 1;
            } else {
                input[i] = 0;
            }
        }
    }
}