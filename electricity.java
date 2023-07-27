import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        int units;
        int total_bills;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units of electricity :");

        units = sc.nextInt();

        if (units > 1 && units < 100) {
            total_bills = 10 * units;
            System.out.println(total_bills);
        } else if (units > 100 && units < 200) {
            total_bills = (15 * (units - 100))+1000;
            System.out.println(total_bills);
        } else if (units > 200 && units < 300) {
            total_bills = (20 * (units-200))+2500;
            System.out.println(total_bills);
        } else {
            total_bills = (25 * (units-300))+4500;
            System.out.println(total_bills);
        }

    }
}
