import java.util.Arrays;
/*
project explanation:
we take in the array, make an array of the same size.
with a loop, check each index of the original array, if they aren't zero, add them to the sort list starting at the inital index.
The rest will naturally be zero. Output the sorted array.
 */
public class Final3 {
    public static int[] sortZero(int[] array){
        int[] sorted = new int[array.length];
        int count = 0;
        for (int j : array) {
            if (j != 0) {
                sorted[count] = j;
                count++;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortZero(new int[]{1, 0, 2, 0, 4, 3, 2, 0, 0, 9})));
    }
}
