import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a letter: ");
        String letter = input.next();
        char ch = letter.toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            System.out.println(letter + " is a vowel.");
        }
        else if(ch < 'A'|| ch > 'z'){
            System.out.println(letter + " is an invalid input.");
        }
        else{
            System.out.println(letter + " is a consonant.");
        }
    }
}
