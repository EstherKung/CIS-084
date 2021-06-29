import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = -1;
        boolean pass = true;
        while (pass){
            System.out.print("Rock (0), paper (1), or scissors (2)? ");
            user = input.nextInt();
            if (!(0 <= user && user <= 2)){
                System.out.println("that's an invalid input! please try again.");
            }
            else{
                pass = false;
            }
        }
        int comp = (int)Math.floor(Math.random()*3);
        System.out.println(comp + " " + user);
        if (comp == user){
            System.out.println("it is a draw.");
        }
        else{
            //simplified from user == 1 && comp == 0 || user == 2 && comp == 1 || user == 0 && comp == 2
            if (user > comp && user + comp != 2 || (user == 0 && comp == 2)) {
                System.out.println("you won!");
            }
            //simplified from user == 0 && comp == 1 || user == 1 && comp == 2 || user == 2 && comp == 0
            else{
                System.out.println("you lost!");
            }
        }
    }
}
