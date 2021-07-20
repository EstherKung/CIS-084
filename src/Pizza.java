public class Pizza extends Restaurant {
    double price = 0;
    char size;
    Pizza(String name, char size){
        super(name);
        this.size = size;
        switch (name) {
            case "cheese" -> price += 10.0;
            case "pepperoni" -> price += 11.0;
            case "vegetable" -> price += 12.0;
            default -> throw new IllegalStateException("Unexpected value: " + name);
        }
        switch (size) {
            case 's' -> price *= 1;
            case 'm' -> price *= 1.25;
            case 'l' -> price *= 1.5;
            default -> throw new IllegalStateException("Unexpected value: " + size);
        }
    }

    public double price(int amount){
        return Math.round(price*amount* 1.1* 100.0)/100.0;
    }
}