import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        int num;
        int temp;

        int rem, quotient;
        int reverse = 0;
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = sc.nextInt();
        temp = num;


        while (num > 0) {
            // 121 //12
            rem = num % 10; // 1 1-> rem //rem->2 // rem-1
            reverse = (reverse * 10) + rem; // (0*10)+1 = 1 , (1*10)+2=12 , (12*10)+1=121
            num = num / 10; // 121/10 = 12 , q=1
            // num = quotient;
            // 12->num , num=1

        }
        System.out.println("Reverse of is:" + reverse);
        if(temp == reverse){
            System.out.println("palindrome");
        }
        else
        {
            System.out.println(" not palindrome");
        }

    }
}
