public class AdjacentGap {
    public static int minGap(int[] array){
        if (array.length < 2){
            return 0;
        }
        else {
            int min = array[1] - array [0];
            int comp = 0;
            for (int i = 0; i < array.length-1; i++ ){
                comp = array[i+1] - array[i];
                if (min > comp){
                    min = comp;
                }
            }
            return min;
        }
    }

    public static void main(String[] args) {
        System.out.println(minGap(new int[]{1, -1, 4, 6, 10, 20}));
    }
}
