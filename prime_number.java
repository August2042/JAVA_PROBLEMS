import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        int num;
        int count = 0;

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;

            }
        }
        // System.out.println(count);
        if (count == 2) {
            System.out.println("The given number is prime....");
        } else {
            System.out.println("The given number is not prime...");
        }

     

    }
}
