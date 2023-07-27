import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1, num_2;

        System.out.println("Enter the first number :");
        num_1 = sc.nextInt();
        System.out.println("Enter the second number :");
        num_2 = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <= num_1 && i <= num_2; i++) {
            if (num_1 % i == 0 && num_2 % i == 0) {

                hcf = i;
            }
        }
        System.out.println(hcf);

    }
}
