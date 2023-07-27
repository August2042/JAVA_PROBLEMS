import java.util.*;

public class practice {
    public static void main(String[] args) {

        // System.out.println(num);
        char ch;

        do {
            int num;
            int total_bill ;
            int quant;

            System.out.println("Enter the no. :");
            Scanner obj = new Scanner(System.in);
            num = obj.nextInt();

            switch (num) {
                case 1:

                    System.out.println("Dosa");
                    System.out.println("The total price is Rs. 50");
                    System.out.println("Enter the quantity of Dosa :");
                    quant = obj.nextInt();
                    total_bill = 50 * quant;
                    System.out.println("The total bill =" + total_bill);

                    break;
                case 2:
                    System.out.println("Burger");
                    System.out.println("The total price is Rs. 80");
                    System.out.println("Enter the quantity of burger :");
                    quant = obj.nextInt();
                    total_bill = 80 * quant;
                    System.out.println("The total bill =" + total_bill);
                    break;
                case 3:
                    System.out.println("Shake");
                    System.out.println("The total price is Rs. 40");
                    System.out.println("Enter the quantity of Shake :");
                    quant = obj.nextInt();
                    total_bill = 40 * quant;
                    System.out.println("The total bill =" + total_bill);
                    break;
                case 4:
                    System.out.println("Noodles");
                    System.out.println("The total price is Rs. 60");
                    System.out.println("Enter the quantity of Noodles :");
                    quant = obj.nextInt();
                    total_bill = 60 * quant;
                    System.out.println("The total bill =" + total_bill);
                    break;
                default:
                    System.out.println("The total price is Enter the correct choice");
                    break;
            }
            System.out.println("Do you want to continue if yes then press y or else n");
            ch = obj.next().charAt(0);

        } while (ch == 'y');

    }
}
