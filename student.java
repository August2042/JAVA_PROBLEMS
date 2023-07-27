import java.util.Scanner;

public class student {

    // int id;
    // String name;
    // int roll_no;

    // void display(int id,String name , int roll_no)
    // {
    // System.out.println("id = "+id + " "+ "Name = " +name + " " + "Roll No. = "
    // +roll_no );
    // }

    // public static void main(String[] args) {
    // student obj = new student();
    // obj.display(1063, "Ak", 05);
    // }

    int id;
    String name;
    int age;

    void getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id :");
        id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the name :");
        name = sc.nextLine();

        System.out.println("Enter the age :");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("The id of the student :" + id);
        System.out.println("The name of the student :" + name);
        System.out.println("The age of the student :" + age);
    }

    public static void main(String[] args) {
        student obj = new student();
        obj.getinfo();
        obj.display();
    }
}
