import java.util.Scanner;

public class largest_among3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter the number 1 :");
        num1 = sc.nextInt();
        System.out.println("Enter the number 2 :");
        num2 = sc.nextInt();
        System.out.println("Enter the number 3 :");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number is" + num1);
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("Largest number is " + num2);
        } else {
            System.out.println("Largest number is " + num3);
        }

    }
}
