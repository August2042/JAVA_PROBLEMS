import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int rem;
        int number = 0;
        int temp;
        // int x=0;
        int quotient;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        temp = num;
        // 153%10 = 3 =q
        // 15%10=5
        // 1%10=1
        while (num > 0) {
            rem = num % 10; // 153%10 - rem =3
            number = (rem * rem * rem  ) + number;
            quotient = num / 10;
            num = quotient;
        }
        System.out.println(number);
        if (temp == number) {
            System.out.println("Given number is Arrmstrong..");

        }

        else {
            System.out.println("Given number is not Arrmstrong..");
        }

    }
}
