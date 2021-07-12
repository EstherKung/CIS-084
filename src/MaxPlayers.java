import java.util.Scanner;
public class MaxPlayers {
    public static void main(String[] args) {
        System.out.print("enter the number of players allowed on the team: ");
        Scanner input = new Scanner(System.in);
        int totalPlayers = input.nextInt();
        System.out.print("enter the number of players trying to get on the team: ");
        int attemptPlayers = input.nextInt();
        int need = Math.abs(totalPlayers - attemptPlayers);
        if(attemptPlayers < totalPlayers){
            System.out.println("There are not enough players. " + need + " more players are needed.");
        }
        else if(attemptPlayers > totalPlayers){
            System.out.println("There are too many players. " + need + " players need to be eliminated.");
        }
        else{
            System.out.println("play ahead and have fun!");
        }
    }
}
