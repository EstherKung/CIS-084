import java.util.ArrayList;
public class LoopPatterns {
    public static void lowerLeft(boolean[] list) {
        for (int i = 0; i < list.length; i++){
            list[i] = true;
            for (int j = 1; j <= i + 1; j++){
                if (list[i]){
                    System.out.print(j + " ");
                }
            }
            System.out.println();;
        }
    }

    public static void upperLeft(boolean[] list){
        for (int i = list.length-1; i >= 0; i--) {
                if (!list[i]) {
                    for (int j = 1; j <= i + 1; j++) {
                    System.out.print(j + " ");
                    }
                }
                list[i]= true;
            System.out.println();
        }
    }

    public static void lowerRight(boolean[] list){
        for(int i = 0; i < list.length; i++){
            list[i] = true;
            for(int j = list.length; j > 0; j--){
                if(!list[j-1]){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j);

                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void upperRight(boolean[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            for (int k = list.length -1; list[k]; k--){
                System.out.print("  ");
            }
            for (int j = 0; j < list.length; j++) {
                if (!list[j]) {
                    System.out.print(j + 1);
                }
                else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            list[i] = true;
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        boolean[] patternA = new boolean[6];
//        System.out.println("Pattern A: ");
//        lowerLeft(patternA);
//        boolean[] patternB = new boolean[6];
//        System.out.println("Pattern B: ");
//        upperLeft(patternB);
//        boolean[] patternC = new boolean[6];
//        System.out.println("Pattern C:");
//        lowerRight(patternC);
        boolean[] patternD = new boolean[6];
        System.out.println("Pattern D: ");
        upperRight(patternD);
    }
}
