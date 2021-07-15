
//extension of Programming Tryout Test
class ForwardNobonacci {

    public static int nobonacci(final int n) {
        int[] up = new int[n+1];
        for (int i = 0; i <= n; i++) {
            if (i < 3) {
                up[i] = 1;
            } else {
                up[i] = 2 * up[i-1] - up[i-2] + up[i-3];
               // System.out.println(up[i]);
            }
        }
        return up[n];
    }

    public static void main(String[] args) {
        System.out.println(nobonacci(30));
    }
}
