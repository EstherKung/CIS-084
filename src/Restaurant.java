
import java.util.ArrayList;
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
        boolean complete = false;
        ArrayList<Pizza> order = new ArrayList<>();
        ArrayList<Integer> amount = new ArrayList<>();
        while (!complete) {
            System.out.println("what type of pizza would you like to order?");
            String type = input.next().toLowerCase();

            System.out.println("what size would you like your " + type + " pizza?");
            char size = input.next().toLowerCase().charAt(0);

            System.out.println("how many " + type + " pizzas of the indicated size would you like to order?");
            amount.add(input.nextInt());

            order.add(new Pizza(type, size));

            System.out.println("would you like to add more to your order?");
            char cont = input.next().toLowerCase().charAt(0);

            if (cont == 'n'){ complete = true; }
        }
        double total = 0.0d;
        for (int i = 0; i < order.size(); i++){
            total += order.get(i).price(amount.get(i));
        }
       System.out.println("Your total is: $" + total);

    }
}