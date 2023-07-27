import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= range; i++) {
            System.out.println(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        input.close();
    }
}
