import java.util.Scanner;

public class lms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int rem;
        int x = 0;
    

        System.out.println("Enter the Number :");
        num = sc.nextInt();
        int temp=num;
        while (num > 0) {

            rem = num % 10; // 121%10 = 1 ,
            x = x + rem;
            num = num / 10;
            

        }
        System.out.println(x);

    }

}
