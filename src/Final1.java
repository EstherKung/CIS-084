import java.util.Scanner;
/* explanation behind program:
    take in an integer ->
    divide it by 10 until single digit appears, add that to the sum and substract this from the number
    continue process until we have no more digit to divide
    return the sum.
 */
public class Final1 {
    public static int digitSum(int number) {
        int sum = 0;
        while (number >= 1) {
            int track = number;
            int j = 0;
            while (track >= 10) {
                track /= 10;
                j++;
            }
            sum += track;
            number -= Math.pow(10, j) * track;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input an integer: ");
        System.out.println(digitSum(input.nextInt()));
    }
}
