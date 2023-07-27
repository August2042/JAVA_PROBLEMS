import java.util.*;

class ShowRoom {
    String name;
    long mobile_number;
    double cost;
    double discount;
    double amount;

    ShowRoom() {
        // Default constructor
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name :");
        name = sc.nextLine();

        System.out.println("Enter the customer mobile number :");
        mobile_number = sc.nextLong();

        System.out.println("Enter the  cost of product :");
        cost = sc.nextDouble();

    }

    void calculate() {
        if (cost <= 10000) {
            discount = 0.05 * cost;
            amount = cost - discount;

        } else if (cost > 10000 && cost <= 20000) {
            discount = 0.1 * cost;
            amount = cost - discount;

        } else if (cost > 20000 && cost <= 35000) {
            discount = 0.15 * cost;
            amount = cost - discount;

        } else {
            discount = 0.2 * cost;
            amount = cost - discount;

        }
    }

    void display() {
        System.out.println("Customer Name :\t" + name);
        System.out.println("Customer Mobile Number :" + mobile_number);
        System.out.println("The total amount paid after discount :\t" + amount);
    }

    public static void main(String[] args) {

        ShowRoom obj = new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();

    }
}
