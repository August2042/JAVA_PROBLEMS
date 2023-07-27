import java.util.*;

public class sum_of_user_enterd_no {
    public static void main(String[] args) {
         int num;
         int sum = 0;
         int rem;
         System.out.println("Enter ");
         Scanner sc = new Scanner(System.in);

         num = sc.nextInt();

         while(num>0){
            System.out.println(num>0);
            rem = num%10;
            num = num/10;
            sum = sum+rem;
            System.out.println(sum);
         }
         
    }
}
