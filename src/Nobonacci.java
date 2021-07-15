import java.util.Arrays;
//not course related- 7/12/21 Programming Tryout Test (7-9)
class Nobonacci {

    static int[] counter = new int[41];
//    static int[] tracker = new int[41];

    public static int nobonacci1(final int n) {
        counter[n] += 1;
        if (n < 3) {
            return 1;
        } else {
            return 2 * nobonacci1(n-1) - nobonacci1(n-2) + nobonacci1(n-3);
        }
    }

    public static int memoizedNobonacci(final int n){
        int[] tracker = new int[n+1];
        return nobonacci(n, tracker);
     }

    public static int nobonacci(final int n, int[] tracker) {
        counter[n] += 1;
        if (n < 3) {
            if (tracker[n] == 0){
                tracker[n] = 1;
             }
            return 1;
        } else {
            if (tracker[n] == 0) {
                tracker[n] = 2 * nobonacci(n - 1, tracker) - nobonacci(n - 2, tracker) + nobonacci(n - 3, tracker);
            }
            return tracker[n];
        }
    }

    public static void main(String[] args) {
//        System.out.println(nobonacci(35));
///        System.out.println(nobonacci(40));
// System.out.println(Arrays.toString(counter));
//        counter = new int[41];
//        System.out.println(nobonacci1(40));
//        System.out.println(Arrays.toString(counter));
        System.out.println(memoizedNobonacci(30));
        System.out.println(Arrays.toString(counter));
    }
}
