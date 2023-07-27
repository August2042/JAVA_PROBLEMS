import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        int fact = 1;
        // int factorial;
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            fact = fact * i;

        }
        System.out.println("The factorial of " + num + "=" + fact);

    }
}
