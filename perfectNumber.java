import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int num, rem;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            rem = num % i;
            if (rem == 0) {
                sum = sum + i;

            }
        }
        if (sum == num) {
            System.out.println("The given number is perfect...");
        } else {
            System.out.println("The given number is not perfect..");
        }

    }
}
