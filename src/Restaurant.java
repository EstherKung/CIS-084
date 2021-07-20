
import java.util.Scanner;
public class Restaurant {
    String name;
    String type = "Pizza";
    Restaurant(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.printf("%-10s %s \n", "Pizza Type", "Price");
        System.out.printf("%-11s %s \n %-10s %s \n %-10s %s \n",
                " Cheese", "$10",
                "Pepperoni", "$11",
                "Vegetable", "$12");
        System.out.println("Medium is 1.25 times the price, Large is 1.5 times the price listed.");

        Scanner input = new Scanner(System.in);

        System.out.println("what type of pizza would you like to order?");
        String type = input.nextLine().toLowerCase();

        System.out.println("how many " + type + " pizzas would you like to order?");
        int amount = input.nextInt();

        System.out.println("what size would you like your " + type + " pizza?");
        char size = input.next().toLowerCase().charAt(0);

        Pizza order = new Pizza(type, size);
        System.out.println("Your total is: $" + order.price(amount));

    }
}