import java.util.*;
// import java.text.DecimalFormat;

// public class lms_2 {
// // public static void main(String[] args) {
// // int side;
// // int perimeter;
// // Scanner sc = new Scanner(System.in);

// // System.out.println("Enter the side of square:");
// // side = sc.nextInt();
// // perimeter = 4 * side;
// // System.out.println("Gives perimeter of the square : " + perimeter);

// // public static void main(String[] args) {
// // Scanner sc = new Scanner(System.in);
// // int fahrenheit;
// // float celcius;

// // System.out.println("Enter the fahrenheit :");
// // fahrenheit=sc.nextInt();
// // celcius=((fahrenheit-32)*5)/9;

// // System.out.format("%.4f",celcius);

// // }
/* Bank Application */

// public class lms_2{

// public static void main(String[] args) {
// int num;
// int deposit;
// int withdraw;
// int amount = 0;
// int ch;

// do {

// Scanner sc = new Scanner(System.in);

// System.out.println("__________________________________");
// System.out.println("\tWELCOME TO HDFC BANK");
// System.out.println("__________________________________");
// System.out.println("1.Deposit");
// System.out.println("2.Withdraw");
// System.out.println("3.Current Balance");
// System.out.println("Select the number so that you will be able to perform the
// action");
// num = sc.nextInt();

// switch (num) {

// case 1:
// System.out.println("Welcome to Deposit option");

// System.out.println("Enter the amount you want to deposit in bank");
// deposit = sc.nextInt();
// amount = deposit + amount;
// System.out.println(amount);

// break;
// case 2:
// System.out.println("Welcome to Withdraw option");
// System.out.println("Enter the amount you want to withdraw from bank");
// withdraw = sc.nextInt();
// if (withdraw < amount) {

// amount = amount-withdraw;
// } else {
// System.out.println("SORRY!!! /n Insufficient Balance ");
// }

// break;
// case 3:

// System.out.println("The available balance in bank :" + amount);

// break;
// default:
// System.out.println("Enter the correct option");
// break;
// }
// System.out.println("If you want to continue the application then press y or
// else n");
// ch = sc.next().charAt(0);

// } while (ch == 'y');
// }

// }

// import java.util.Scanner;

// public class lms_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String ch;

// do {
// int radius;
// float area;
// System.out.println("Enter the radius :");
// radius = sc.nextInt();
// area = 3.14f * radius * radius;
// System.out.println("The calculated area " + area);
// System.out.println("If you want to continue it then type yes otherwise no");
// ch = sc.next();

// } while (ch.equals("yes"));
// }
// }

/* Module 10 */
// public class lms_2 {

// String name;
// int year_of_joining;
// String address;

// public void get_information(String name, int year_of_joining, String address)
// {
// this.name = name;
// this.year_of_joining = year_of_joining;
// this.address = address;
// }

// public void display() {

// System.out.println(name + " " + year_of_joining + " " + address);
// }

// public static void main(String[] args) {
// lms_2 obj = new lms_2();
// lms_2 obj1 = new lms_2();
// lms_2 obj2 = new lms_2();

// System.out.println("Name " + "Year of joining " + "Address ");
// obj.get_information("Robert", 1994, "64C-WallsStreat");
// obj.display();
// obj1.get_information("Sam ", 2000, "68D-WallsStreat");
// obj1.display();
// obj2.get_information("John ", 1999, "26B-WallsStreat");
// obj2.display();
// }
// }

// public class lms_2 {

// int num1, num2, num3;
// float average;

// lms_2(int num1, int num2, int num3) {
// this.num1 = num1;
// this.num2 = num2;
// this.num3 = num3;

// }

// public void calculate() {
// average = (num1 + num2 + num3) / 3;
// System.out.println("The average of threee number :" + average);

// }

// public static void main(String[] args) {
// int x,y,z;
// Scanner sc= new Scanner(System.in);
// System.out.println("Enter the num 1 :");
// x=sc.nextInt();
// System.out.println("Enter the num 2 :");
// y=sc.nextInt();
// System.out.println("Enter the num 3 :");
// z=sc.nextInt();
// lms_2 obj = new lms_2(x, y, z);
// obj.calculate();
// }

// }

// class area_of_raectangle {
// int l, b, area;

// area_of_raectangle(int l , int b)
// {
// this.l=l;
// this.b=b;
// }

// public int calculate_area() {
// area = l * b;
// return area;
// }
// }

// public class lms_2 {
// public static void main(String[] args) {
// int x, y,rectangle;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the length");
// x = sc.nextInt();
// System.out.println("Enter the breadth");
// y = sc.nextInt();

// area_of_raectangle obj = new area_of_raectangle(x,y);
// rectangle=obj.calculate_area();
// System.out.println("The area of rectangle :"+rectangle);

// }

// }

// class student {
// int rollNo;
// long phone_No;
// String address, name;

// student(int rollNo, long phone_No, String address, String name) {
// this.rollNo = rollNo;
// this.phone_No = phone_No;
// this.address = address;
// this.name = name;

// }

// void display() {

// System.out.println(name + "\t" + rollNo + "\t\t" + address + "\t" +
// phone_No);
// }

// }

// public class lms_2 {
// public static void main(String[] args) {
// System.out.println("------------------------------------------");
// System.out.println("Name" + "\tRoll No." + "\tAddress" + "\tPhone No.");
// System.out.println("------------------------------------------");
// student obj = new student(10, 1885852042L, "Chicago", "Sam");
// obj.display();
// student ob1 = new student(11, 111585486L, "Berlin", "John");
// ob1.display();
// }
// }

// interface BankAccount {
// void deposit(int amount);

// void withdraw(int withdraw_amount);

// }

// class CheckingAccount implements BankAccount {

// int balance;
// int amount;
// int withdraw_amount;

// public void deposit(int amount) {
// balance += amount;
// System.out.println("The deposited money in the account :" + amount);

// }

// public void withdraw(int withdraw_amount) {
// if (withdraw_amount <= balance) {
// balance -= withdraw_amount;
// System.out.println("The availabe amount int the account : " + balance);
// } else {
// System.out.println("Insufficient Balance");
// }

// }

// public static void main(String[] args) {
// CheckingAccount obj = new CheckingAccount();
// obj.deposit(1000);
// obj.withdraw(500);

// }

// }

// import java.util.Scanner;

// public class ShowRoom {
// String name;
// long mob_no;
// double cost;
// double dis;
// double amount;

// ShowRoom() {
// // name="Ak";
// // mob_no=9953182042L;

// }

// void input() {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the name of the customer :");
// name = sc.nextLine();
// System.out.println("Enter the mobile number :");
// mob_no = sc.nextLong();
// System.out.println("Enter the cost of the item you purchased :");
// cost = sc.nextDouble();

// }

// void calculate() {
// if (cost <= 10000) {
// amount = cost - (cost * 0.05);

// } else if (cost > 10000 && cost <= 20000) {
// amount = cost - (cost * 0.1);

// } else if (cost > 20000 && cost <= 35000) {
// amount = cost - (cost * 0.15);

// } else {
// amount = cost - (cost * 0.2);

// }

// }

// public void display() {
// System.out.println("The name of the customer :" + name);
// System.out.println("The mobile number of the customer :" + mob_no);
// System.out.println("The amount to be paid after discount :" + amount);

// }

// public static void main(String[] args) {
// ShowRoom obj = new ShowRoom();
// obj.input();
// obj.calculate();
// obj.display();
// }
// }

// import java.util.*;

// public class lms_2 {

// int s;
// int l, b, r;

// void perimeter_square(int s) {
// int p_1;

// p_1 = 4 * s;
// System.out.println("The perimeter of square :" + p_1);

// }

// void perimeter_rectangle(int l, int b) {
// int p_2;
// p_2 = 2 * (l + b);
// System.out.println("The perimeter of rectangle:" + p_2);
// }

// void perimeter_circle(float r) {
// float p_3;
// p_3 = 2 * (22 / 7) * r;
// System.out.println("The perimeter of circle:" + p_3);
// }

// public static void main(String[] args) {

// lms_2 sc = new lms_2();
// sc.perimeter_square(10);
// sc.perimeter_rectangle(5, 4);
// sc.perimeter_circle(20.3f);

// }

// }

// class employee {
// int emp_id;
// String name;
// int salary;

// employee(int emp_id, String name, int salary) {
// this.emp_id = emp_id;
// this.name = name;
// this.salary = salary;
// }

// void display() {
// System.out.println("Emp_Id\t" + "Name\t" + "Salary");
// System.out.println(emp_id + "\t" + name + "\t" + salary);
// }
// }

// public class lms_2 {
// public static void main(String[] args) {
// int x, y;
// String z;
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the details of employee:");
// System.out.println("Enter the Emp_Id :");
// x = sc.nextInt();
// sc.nextLine();
// System.out.println("Enter the name of employee :");
// z = sc.nextLine();

// System.out.println("Enter the salary of employee:");
// y = sc.nextInt();

// employee ob = new employee(x, z , y);
// ob.display();
// }
// }

// class lms_2 {
// double radius = 1.0;
// String color;
// double area;

// public double getArea() {
// area = 3.14 * radius * radius;
// return area;

// }

// public static void main(String[] args) {
// double x;
// lms_2 obj = new lms_2();
// x = obj.getArea();
// System.out.println(x);

// }
// }

// public class lms_2 {
// static int id = 1010;
// static String name = "August";

// static void display() {
// System.out.println("Id=" + id + "\t" + "Name=" + name);
// }

// public static void main(String[] args) {
// display();

// }
// }

/*
 * Try to create functional interface of Adder(add 2 numbers) ,
 * UpperString(convert string in to uppercase) and print them using lambda
 * expression.
 * WAP to calculate the sum of given no. No of digits on which sum operation is
 * to be performed is taken by the user. (you have to use overloading feature of
 * OOPs ).
 * WAP for displaying information of faculty by using an overriding feature of
 * oops. (hint: you have to create a faculty class having a display function
 * which will extend the Employee class having a display() function )
 * WAP for storing information of 5 Students using class and Object feature of
 * oops.
 * )WAP for creating searchWordFunction() in the Search class for searching and
 * counting the occurrence of a particular word in a given string.
 */

// interface Adder{
// public void add(int num1,int num2);
// }
// interface UpperString
// {
// public void convert(String a);
// }
// public class lms_2 implements Adder , UpperString
// {
// int num1,num2;
// int sum;
// String Bigcase;
// public void add(int num1,int num2)
// {
// sum=num1+num2;
// System.out.println("The sum of two number :"+sum);
// }
// public void convert(String a)
// {
// Bigcase= a.toUpperCase();
// System.out.println(Bigcase);

// }
// public static void main(String[] args) {
// lms_2 obj = new lms_2();
// obj.add(10, 20);
// obj.convert("hello world");
// }
// }

// import java.util.Scanner;

// public class lms_2 {

// public static int countOccurrences(String inputString, String searchWord) {
// int count = 0;
// int wordLength = searchWord.length();
// int lastIndex = inputString.length() - wordLength + 1;

// for (int i = 0; i < lastIndex; i++) {
// if (inputString.regionMatches(i, searchWord, 0, wordLength)) {
// count++;
// }
// }

// return count;
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the input string: ");
// String inputString = scanner.nextLine();

// System.out.print("Enter the word to search: ");
// String searchWord = scanner.nextLine();

// int occurrenceCount = countOccurrences(inputString, searchWord);
// System.out.println("The word \"" + searchWord + "\" occurs " +
// occurrenceCount + " time(s) in the input string.");

// scanner.close();
// }
// }.

/*
 * . Create a Book class to store Books information
 * 
 * (bookid, title, author name, price).Create an object and assign values to
 * Book variables and print them using a method.
 */
// class Book {
// private int bookid;
// private String title;
// private String author_name;
// private int price;

// Book(int bookid, String title, String author_name, int price) {
// this.bookid = bookid;
// this.title = title;
// this.author_name = author_name;
// this.price = price;

// }
// void display()
// {
// System.out.println("Book Id :"+bookid);
// System.out.println("Title :"+title);
// System.out.println("Author Name :"+author_name);
// System.out.println("Price :"+price);
// }
// }
// public class lms_2
// {
// public static void main(String[] args) {
// Book obj = new Book(101, "Ramayan", "Ram charit manas", 100);
// obj.display();
// }
// }
/*
 * Create a parent class called "Vehicle" with attributes such as brand, model,
 * year, and a method called "drive". Create a child class called "Car" that
 * inherits from Vehicle and has an additional attribute called "color" and a
 * method called "honk". Create an object of the Car class and call both the
 * "drive" and "honk" methods.
 * 
 * Not completed: ANP-C4589
 * Create a parent class called "Person" with attributes such as name, age, and
 * a method called "speak". Create a child class called "Student" that inherits
 * from Person and has an additional attribute called "grade" and a method
 * called "study". Create an object of the Student class and call both the
 * "speak" and "study" methods.
 */

// class Vehicle{
// String brand;
// String model;
// int year;

// protected void drive()
// {
// System.out.println("Hello");
// }
// }
// class car extends Vehicle
// {
// String color;
// protected void honk()
// {
// System.out.println("Hiii");
// }
// }
// public class lms_2
// {
// public static void main(String[] args) {
// car obj=new car();
// obj.drive();
// obj.honk();
// }
// }

// class Vehicle {
// String brand;
// String model;
// int year;

// // Constructor for Vehicle class
// public Vehicle(String brand, String model, int year) {
// this.brand = brand;
// this.model = model;
// this.year = year;
// }

// // Method to drive the vehicle
// public void drive() {
// System.out.println("Driving the " + brand + " " + model);
// }
// }

// class Car extends Vehicle {
// String color;

// // Constructor for Car class
// public Car(String brand, String model, int year, String color) {
// super(brand, model, year);
// this.color = color;
// }

// // Method to honk the car horn
// public void honk() {
// System.out.println("Honking the " + brand + " " + model + " in " + color + "
// color");
// }
// }

// public class lms_2
// {

// public static void main(String[] args) {
// // Create an object of the Car class
// Car myCar = new Car("Toyota", "Camry", 2022, "Red");

// // Call the "drive" method from the Vehicle class
// myCar.drive();

// // Call the "honk" method from the Car class
// myCar.honk();
// }
// }
/*
 * Create an abstract class called "BankAccount" with attributes such as account
 * number and balance, and abstract methods called "deposit" and "withdraw".
 * Create a subclass called "CheckingAccount" that inherits from BankAccount and
 * implements the "deposit" and "withdraw" methods. Create an object of the
 * CheckingAccount class and call both the "deposit" and "withdraw" methods.
 */

// abstract class BankAccount {
//     int account_no;
//     int balance;

//     abstract void deposit(int amount);

//     abstract void withdraw(int withdraw_amount);
// }

// class CheckingAccount extends BankAccount {
//     public CheckingAccount(int account_no, int balance) {
//         this.account_no = account_no;
//         this.balance = balance;
//     }

//     @Override
//     void deposit(int amount) {
//         balance += amount;
//         System.out.println(balance + " deposited");
//     }

//     @Override
//     void withdraw(int withdraw_amount) {
//         if (balance >= withdraw_amount) {
//             balance -= withdraw_amount;
//             System.out.println(balance + " withdrawn");
//         } else {
//             System.out.println("Insufficient balance");
//         }
//     }
// }

// public class lms_2 {
//     public static void main(String[] args) {
//         CheckingAccount obj = new CheckingAccount(1234, 10000);
//         obj.deposit(5000);
//         obj.withdraw(4000);
//     }
// }
/*  Today's Lab  */
//Question 1:
// class perimeter {

//     int perimeter_square;
//     int perimeter_rectangle;
//     float perimeter_circle;

//     int Perimeter_1(int side)

//     {
//         perimeter_square = 4 * side;
//         return perimeter_square;

//     }

//     int Perimeter_1(int length, int breadth) {
//         perimeter_rectangle = 2 * (length + breadth);
//         return perimeter_rectangle;
//     }

//     float Perimeter_1(float radius) {
//         perimeter_circle = 2 * 3.14f * radius;
//         return perimeter_circle;
//     }

// }

// public class lms_2 {
//     public static void main(String[] args) {
//         perimeter obj = new perimeter();
//         System.out.println("The perimeter of square : " + obj.Perimeter_1(5));
//         System.out.println("The perimeter of rectangle : " + obj.Perimeter_1(10, 12));
//         System.out.println("The perimeter of circle : " + obj.Perimeter_1(42.0f));

//     }
// }

// Question 2:
// class ShowRoom {
//     String name;
//     long mobile_number;
//     double cost;
//     double discount;
//     double amount;

//     ShowRoom() {
//         // Default constructor
//     }

//     void input() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the customer name :");
//         name = sc.nextLine();

//         System.out.println("Enter the customer mobile number :");
//         mobile_number = sc.nextLong();

//         System.out.println("Enter the  cost of product :");
//         cost = sc.nextDouble();

//     }

//     void calculate() {
//         if (cost <= 10000) {
//             discount = 0.05 * cost;
//             amount = cost - discount;

//         } else if (cost > 10000 && cost <= 20000) {
//             discount = 0.1 * cost;
//             amount = cost - discount;

//         } else if (cost > 20000 && cost <= 35000) {
//             discount = 0.15 * cost;
//             amount = cost - discount;

//         } else {
//             discount = 0.2 * cost;
//             amount = cost - discount;

//         }
//     }

//     void display() {
//         System.out.println("Customer Name :\t" + name);
//         System.out.println("Customer Mobile Number :" + mobile_number);
//         System.out.println("The total amount paid after discount :\t" + amount);
//     }
// }

// public class lms_2 {
//     public static void main(String[] args) {

//         ShowRoom obj = new ShowRoom();
//         obj.input();
//         obj.calculate();
//         obj.display();

//     }
// }
