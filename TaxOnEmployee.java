import java.util.Scanner;

public class TaxOnEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int salary;
        double tax;

        System.out.println("Enter the name of the employee :");
        name = sc.nextLine();
        System.out.println("Enter the salary of the employee :");
        salary = sc.nextInt();

        System.out.println("Name of Employee :" + name);
        System.out.println("Salary of employee :" + salary);

        if (salary <= 250000) {
            tax = 0;
            System.out.println("TAX :" + tax);
        } else if (salary <= 500000) {
            tax = (salary - 250000) * 0.1;
            System.out.println("TAX :" + tax);
        } else if (salary <= 1000000) {
            tax = 30000 + (salary - 500000) * 0.2;
            System.out.println("TAX :" + tax);
        } else {
            tax = 50000 + (salary - 1000000) * 0.3;
            System.out.println("TAX :" + tax);
        }

    }
}
