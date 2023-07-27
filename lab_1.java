import java.util.*;

public class lab_1 {

    /*PATTERN QUESTION */
    // public static void main(String[] args) {

    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }
    // }


    /*QUESTION -> The sum of number enterd by the user */
    // public static void main(String[] args) {
    // int x;
    // int sum = 0;
    // for (int i = 1; i <= 10; i++) {
    // // System.out.println("Enter the number " + i);// 1 number is entered by you
    // : 10
    // System.out.print(i+"."+"Number is enterd by you :");
    // Scanner sc = new Scanner(System.in);
    // x = sc.nextInt();
    // sum = sum + x;
    // }
    // System.out.println("The sum of all the number entered by the user :\t"+sum);
    // }


    /*QUESTION -> Reverse of given string */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int length_of_name;
        String rev = "";
         System.out.print("Enter the name : ");
        name = sc.nextLine();
        length_of_name = name.length();
        for (int i = length_of_name - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("The reverse of " + name + " : " + rev);
        if(rev.equals(name))
        {
            System.out.println("Yes");

        }
        else
        {
            System.out.println("No");
        }
    }
}
