import java.util.Scanner;

public class PasswordCheck {
    public static boolean check(String password){
        if(password.length()<8){
            return false;
        }
        int k = 0;
        for(int i = 0; i < password.length(); i++){
            if (password.charAt(i) < '0' || password.charAt(i) > 'z'){
                return false;
            }
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                k++;
            }
        }
        return k >= 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");
        System.out.println("Enter a Password: ");
        String pw = input.nextLine();
        if(check(pw)){
            System.out.println("password is valid: " + pw);
        }
        else{
            System.out.println("password is invalid: " + pw);
        }
    }
}
