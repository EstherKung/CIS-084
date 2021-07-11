import java.util.ArrayList;
import java.util.List;

public class MidTerm2 {
    public static void main(String[] args) {
        List<Integer> prime = new ArrayList<>();
        for(int i = 50; i <= 180; i++){
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    break;
                }
                else if(i % j != 0 && i -1 == j){
                    prime.add(i);
                }
            }
        }
        System.out.println("The prime numbers between 50 and 180 are: " + prime);
        System.out.println("That makes it a total of " + prime.size() + " prime numbers in the range.");
        int sum = 0;
        for (int k = 0; k < prime.size(); k++){
            sum += prime.get(k);
        }
        System.out.println("The sum of all these prim numbers is: " + sum);
    }
}
