import java.util.Arrays;
import java.util.Scanner;

public class VowelCount {
    static char[] vowels = new char[]{
            'a', 'e', 'i', 'o', 'u'
    };
    public static int[] vowelCount(String string){
        int[] counter = new int[5];
        for(int i = 0; i < string.length(); i++){
            for (int j = 0; j < vowels.length; j++){
                if (string.toLowerCase().charAt(i) == vowels[j]){
                    counter[j] +=1;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("give an intelligent quote: ");
        String sentence = input.nextLine();
        System.out.println(Arrays.toString(vowelCount(sentence)));
    }
}
