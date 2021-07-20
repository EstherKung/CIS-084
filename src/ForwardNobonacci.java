import java.util.ArrayList;

//extension of Programming Tryout Test
class ForwardNobonacci {

    public static int nobonacci(final int n) {
        int[] up = new int[n+1];
        for (int i = 0; i <= n; i++) {
            if (i < 3) {
                up[i] = 1;
               // System.out.println(up[i]);
            } else {
                int count = 2 * up[i] - up[i-1] + up[i-2];
                System.out.println(count);
            }
        }
        return up[n];
    }

    public static int nobonacci3(final int n) {
        ArrayList<Integer> up= new ArrayList<Integer>(3);
        for (int i = 0; i <= n; i++) {
            if (i < 3) {
               up.add(1);
            } else {
                int count = 2 * up.get(2) - up.get(1) + up.get(0);
//                System.out.println(count);
                up.remove(0);
                up.add(count);
            }
        }
        return up.get(2);
    }


    public static void main(String[] args) {
//        System.out.println(nobonacci(30));
        System.out.println(nobonacci3(30));
    }
}
