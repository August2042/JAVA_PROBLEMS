import java.util.Scanner;

class calculator {
    public static void main(String[] args) {

        char chr;
        Scanner obj = new Scanner(System.in);

        // obj.close();

        do {
            System.out.println("Enter the first number :");
            int num1 = obj.nextInt();

            System.out.println("Enter the second number:");
            int num2 = obj.nextInt();

            System.out.println("Enter the operator that you want to perform between a and b :");
            char ch = obj.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("The addition will be performed..");
                    System.out.println("The sum of a and b = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("The subtraction will be performed..");
                    System.out.println("The subtraction of a and b = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("The multiplication will be performed..");
                    System.out.println("The multiplication of a and b = " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("The division will be performed..");
                    System.out.println("The division of a and b = " + (num1 / num2));
                    break;
                  default:
                    System.out.println("Enter the correct charater");
                    break;
                case '%':
                    System.out.println("The modulo will be performed..");
                    System.out.println("The modulo of a and b = " + (num1 % num2));
                    break;

              
            }
            System.out.println("If you want to continue then press y or else n....");
            chr = obj.next().charAt(0);

        } while (chr == 'y');
    }
}