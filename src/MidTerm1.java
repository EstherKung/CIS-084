import java.util.Scanner;
class MidTerm1{
    public static int count(String str, char a){
        int countValue = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == a){
                countValue += 1;
            }
        }
        return countValue;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a string: ");
        String userStr = input.nextLine();
        System.out.print("now, enter a character you'd like to find: ");
        char userCh = input.nextLine().charAt(0);
        System.out.println(userCh + " occurred " + count(userStr, userCh) + " times in your string.");
    }
}