import java.util.*;
public class QuadraticFormula {
        public static void main(String[] args) {
            System.out.print("enter a, b, and c values: ");
            Scanner input = new Scanner(System.in);
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double root;
//calculations!!
            if (a == 0){
                System.out.println("This is not a quadratic!");
                System.exit(-1);
            }
            double discrim = Math.pow(b, 2) - 4 * a * c;
            if (discrim < 0) {
                System.out.println("This equation has no real roots.");
            }
            else if (discrim == 0) {
                root = (-b)/(2*a);
                System.out.println("Your root is: " + root);
            }
            else {
                double sqRoot = Math.sqrt(discrim);
                double r1 = ((-b)+(sqRoot))/(2*a);
                double r2 = ((-b)-(sqRoot))/(2*a);
                System.out.println("Your roots are: " + r1 + " and " + r2);
            }
        }
}
