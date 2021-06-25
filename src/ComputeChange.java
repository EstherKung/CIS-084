import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        System.out.print("enter a monetary value in dollars (e.g. 3.52): ");
        Scanner scan = new Scanner(System.in);
        double value = scan.nextDouble();
        double dollar = value;
        int toonies = (int)Math.floor(value / 2);
        value %= 2;
        int loonies = (int)Math.floor(value/1);
        value -= loonies;
        value *= 100;
        int quarters = (int)Math.floor(value/25);
        value %= 25;
        int dimes = (int)Math.floor(value/10);
        value %= 10;
        int nickels = (int)Math.floor(value/5);
        value %= 5;
        int pennies = (int)Math.round(value);

        System.out.print(dollar + "$ would be equivalent to");
        if (toonies != 0){
            System.out.print(" " + toonies + " toonies");
        }
        if (loonies != 0){
            System.out.print(", " + loonies + " loonies");
        }
        if (quarters != 0){
            System.out.print( ", "+ quarters + " quarters");
        }
        if (dimes != 0){
            System.out.print(", " + dimes +" dimes");
        }
        if (nickels != 0){
            System.out.print(", " + nickels + " nickels");
        }
        if (pennies != 0){
            System.out.print(", and " + pennies + " pennies");
        }
        System.out.print(".");
    }
}
