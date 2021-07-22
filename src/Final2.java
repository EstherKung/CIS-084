/*
combinations I guess! not the most efficient, but checks each indices to see if they add up to the desired value.
if they do, store the pair into an array.
at the end, call out each pair in the array and arrange an equation out of them.
 */
public class Final2 {
    public static void sumPair(int[] array, int number){
        int[][] track = new int[array.length*array.length][2];
        int entry = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j ++){
                if (array[i]+array[j] == number) {
                    track[entry][0] = array[i];
                    track[entry][1] = array[j];
                    entry++;
                }
            }
        }
        System.out.println("Pairs of elements and their sum: ");
        for(int k = 0; k < track.length; k++){
            if(track[k][0] != 0 && track [k][1] != 0){
                System.out.println(track[k][0] + " + " + track[k][1] + " = " + number);
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{2, 7, 4, -5, 11, 5, 20};
        int[] array2 = new int[]{14, -15, 9, 16, 25, 45, 12, 8};
        sumPair(array1, 15);
        sumPair(array2,30);
    }
}
