import java.util.Scanner;

public class pattern123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print the first half of the pattern in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print the second half of the pattern in decreasing order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
