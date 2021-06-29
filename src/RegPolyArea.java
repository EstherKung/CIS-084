import java.util.Scanner;
public class RegPolyArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Entre the side length: ");
        double s = input.nextDouble();
        //Area formula
        double top = n * Math.pow(s, 2);
        double bottom = 4 * Math.tan(Math.PI/n);
        double area = top/bottom;
        System.out.println("The area of the polygon is: " + area);
    }
}
