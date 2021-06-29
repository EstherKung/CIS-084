import java.util.ArrayList;
import java.util.List;

public class NestedPrime {
    public static void main(String[] args) {
        List<Integer> prime = new ArrayList<>();
        for(int i = 100; i <= 200; i++){
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    break;
                }
                else if(i % j != 0 && i -1 == j){
                    prime.add(i);
                }
            }
        }
        System.out.println("The prime numbers between 100 and 200 are: " + prime);
        int sum = 0;
        for (int k = 0; k < prime.size(); k++){
            sum += prime.get(k);
        }
        System.out.println("The sum of all these prim numbers is: " + sum);
    }
}
