import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        System.out.println("Input a 3x3 matrix: ");
        double[][] m1 = new double[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                m1[i][j] = input.nextDouble();
            }
        }
        System.out.println("Input another 3x3 matrix: ");
        double[][] m2 = new double[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m2[i][j] = input.nextDouble();
            }
        }
            System.out.println(Arrays.deepToString(multiplyMatrix(m1, m2)));
    }
}
