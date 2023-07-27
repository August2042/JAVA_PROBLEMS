import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int random_number = (int) (Math.random() * 101);
        Scanner sc = new Scanner(System.in);
        int guess_number = 0;

        System.out.println("Enter the guess number..");
        while (guess_number != random_number) {
            guess_number = sc.nextInt();
            if (guess_number < random_number) {
                System.out.println("Entered number is too loo....");
            } else if (guess_number > random_number) {
                System.out.println("Entered number is too high");

            } else {
                System.out.println("The guess number :" + guess_number);
            }
        }
    }
}
