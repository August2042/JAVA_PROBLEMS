import java.util.*;

class employee {
    int emp_id;
    String name;
    String department;
    int age;

    void getInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee id :");
        emp_id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the name of the employee");
        name = sc.nextLine();

        System.out.println("Enter the Department :");
        department = sc.nextLine();

        System.out.println("Enter the age of employee :");
        age = sc.nextInt();

    }

    void display() {
        System.out.println("The name of the employee : " + name);
        System.out.println("The dpartment of the employee is : " + department);
        System.out.println("The age of the employee : " + age);
        System.out.println("The id of the employee : " + emp_id);
    }

    public static void main(String[] args) {
        employee obj = new employee();
        obj.getInformation();
        obj.display();

    }
}