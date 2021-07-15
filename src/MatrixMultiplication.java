import java.util.Arrays;

public class MatrixMultiplication {
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        if (a[0].length != b.length){
            // a[0].length represents length of the column
            //b.length represents the length of the row
        return null;
        }
        double [][] c = new double[a.length][b[0].length];
        for(int i = 0; i < a.length; i++){ // iterates for rows of a
            for(int k = 0; k < b[i].length; k++) { //makes sure it goes over every column of b
                double entry = 0.0;
                for (int j = 0; j < b[i].length; j++) {
                    entry += a[i][j] * b[j][k]; //each time accessing same a rows, different b
                }
                c[i][k] = entry;
                //System.out.println(entry);
            }
        }
        //matrices, whoo!
        return c;
    }

    public static void main(String[] args) {
        double[][] m1 = new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] m2 = new double[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.println(Arrays.deepToString(multiplyMatrix(m1, m2)));
    }
}
