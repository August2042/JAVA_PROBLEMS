/*Question 1 */

// class shape {
//     public double calculate_area() {
//         return 0.0;
//     }

//     public double calculate_perimetr() {
//         return 0.0;
//     }
// }

// class circle extends shape {
//     int radius;

//     circle(int radius) {
//         this.radius = radius;
//     }

//     public double calculate_area() {
//         return 3.14 * radius * radius;
//     }

//     public double calculate_perimetr() {
//         return 2 * 3.14 * radius;
//     }
// }

// class rectangle extends shape {
//     int length, breadth;

//     rectangle(int length, int breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public double calculate_area() {
//         return length * breadth;
//     }

//     public double calculate_perimetr() {
//         return 2 * (length + breadth);
//     }
// }

// class triangle extends shape {
//     int a, b, c;

//     triangle(int a, int b, int c) {
//         this.a = a;
//         this.b = b;
//         this.c = c;

//     }

//     public double calculate_area() {
//         double s = (a + b + c) / 2;
//         return Math.sqrt(s * (s - a) * (s - b) * (s - c));

//     }

//     public double calculate_perimetr() {
//         return a + b + c;
//     }
// }

// public class Practice_2 {

//     public static void main(String[] args) {

//         circle c = new circle(5);
//         System.out.println("AREA OF CIRCLE:" + c.calculate_area());
//         System.out.println("Perimeter OF CIRCLE:" + c.calculate_perimetr());

//         rectangle r = new rectangle(10, 5);
//         System.out.println("AREA OF RECTANGLE:" + r.calculate_area());
//         System.out.println("Perimeter OF RECTANGLE:" + r.calculate_perimetr());

//         triangle t = new triangle(5, 4, 3);
//         System.out.println("AREA OF TRIANGLE:" + t.calculate_area());
//         System.out.println("Perimeter OF TRIANGLE:" + t.calculate_perimetr());

//     }

// }

/*Question 3*/

// class animal {
//     public void makeSound() {
//         System.out.println("Animal make sound");
//     }

//     public void move() {
//         System.out.println("Animal move");
//     }
// }

// class cat extends animal {
//     public void makeSound() {
//         System.out.println("cat Meow");
//     }

//     public void move() {
//         System.out.println("Cat run");
//     }
// }

// class dog extends animal {
//     public void makeSound() {
//         System.out.println("dog barks");
//     }

//     public void move() {
//         System.out.println("Dog move");
//     }
// }

// class bird extends animal {
//     public void makeSound() {
//         System.out.println("Bird make chirps");
//     }

//     public void move() {
//         System.out.println("bird fly");
//     }
// }

// public class Practice_2 {
//     public static void main(String[] args) {

//         animal obj[] = new animal[3];
//         obj[0] = new dog();
//         obj[1] = new cat();
//         obj[2] = new bird();
//         for (int i = 0; i < obj.length; i++) {
//             obj[i].makeSound();
//             obj[i].move();
//             System.out.println();
//         }
//     }
// }

/*Question 5 */
// class vehicle {
//     public void startEngine() {
//         System.out.println("Vehicle start engine");
//     }

//     public void stopEngine() {
//         System.out.println("Vehicle stop engine");
//     }
// }

// class car extends vehicle {
//     public void drift() {
//         System.out.println("Car is drifting");
//     }
// }

// class motorcycle extends vehicle {
//     public void wheelie() {
//         System.out.println("Motorcycle is doing a wheelie");
//     }
// }

// class truck extends vehicle {
//     public void haulCargo() {
//         System.out.println("Truck is hauling cargo");
//     }
// }

// public class Practice_2 {
//     public static void main(String[] args) {
//         truck obj = new truck();
//         obj.startEngine();
//         obj.haulCargo();
//         obj.stopEngine();

//         System.out.println();

//         car obj1 = new car();
//         obj1.startEngine();
//         obj1.drift();
//         obj1.stopEngine();

//         System.out.println();

//         motorcycle obj2 = new motorcycle();
//         obj2.startEngine();
//         obj2.wheelie();
//         obj2.stopEngine();

//     }
// }

/*Question 6*/
// class Employee {
//     String name;
//     double salary;

//     Employee(String name, double salary) {
//         this.name = name;
//         this.salary = salary;
//     }

//     public String getName() {
//         return name;
//     }

//     public double total_payment() {
//         return salary;
//     }

// }

// class Manager extends Employee {
//     double bonus;

//     Manager(String name, double salary, double bonus) {
//         super(name, salary);
//         this.bonus = bonus;
//     }

//     public String getName() {
//         return name;
//     }

//     public double total_payment() {
//         return salary + bonus;
//     }

// }

// class Worker extends Employee {
//     double hourly_wage;
//     int no_of_hours;

//     Worker(String name, double salary, double hourly_wage, int no_of_hours) {
//         super(name, salary);
//         this.hourly_wage = hourly_wage;
//         this.no_of_hours = no_of_hours;

//     }

//     public String getName() {
//         return name;
//     }

//     public double total_payment() {
//         return hourly_wage * no_of_hours;
//     }

// }

// class Practice_2 {
//     public static void main(String[] args) {
//         System.out.println("MANAGER DETAILS");
//         System.out.println("_______________");
//         // System.out.println();
//         Manager obj = new Manager("August", 50000, 10000);
//         String name = obj.getName();
//         double total_payment = obj.total_payment();
//         System.out.println("Name :" + name);
//         System.out.println("Total Payment :" + total_payment);

//         System.out.println();
//         System.out.println();
//         System.out.println("WORKER DETAILS");
//         System.out.println("_______________");
//         // System.out.println();

//         Worker obj1 = new Worker(" Raj", 0, 1000, 5);
//         String Name = obj1.getName();
//         double TotalPayment = obj1.total_payment();
//         System.out.println("Name :" + Name);
// System.out.println("Total Payment :" + TotalPayment);
//     }
// }

// /*Question 4*/

// class BankAccount {

//         double balance = 0;

//         public void deposit(double amount) {
//                 balance = balance + amount;
//                 System.out.println("Deposited money :" + balance);

//         }

//         public void withdraw(double withdraw_amount) {

//                 if (withdraw_amount <= balance) {
//                         balance = balance - withdraw_amount;
//                         System.out.println("Withdraw money :" + withdraw_amount);
//                 } else {
//                         System.out.println("Insufficient balance !!!!");
//                 }
//                 System.out.println("Remaining Balance :" + balance);

//         }
// }

// class SavingAccount extends BankAccount {

//         int roi, time;

//         SavingAccount(int roi, int time, int balance) {
//                 // super();
//                 this.roi = roi;
//                 this.time = time;

//         }

//         public void calculateInterest() {

//                 double Cal_Interest;

//                 Cal_Interest = (balance * roi * time) / 100;

//                 System.out.println("Total interest :" + Cal_Interest);

//                 System.out.println("Total Balance in Saving Account after adding interest amount :"
//                                 + (balance + Cal_Interest));
//                                 System.out.println("Amount: \u20B91000");
//         }
// }

// // class CheckingAccount extends BankAccount {

// // }
// class Practice_2 {
//         public static void main(String[] args) {
//                 SavingAccount obj = new SavingAccount(5, 5, 0);
//                 obj.deposit(1000);
//                 obj.withdraw(400);
//                 obj.calculateInterest();
//         }
// }


/*Question 7 */

class Product { 
        String name;
        double price;
        String description;

        public Product(String name, double price, String description) {
                this.name = name;
                this.price = price;
                this.description = description;
        }

        public void displayInfo() {
                System.out.println("Name: " + name);
                System.out.println("Price: $" + price);
                System.out.println("Description: " + description);
        }
}

class PhysicalProduct extends Product {
        double weight;

        public PhysicalProduct(String name, double price, String description, double weight) {
                super(name, price, description);
                this.weight = weight;
        }

        public void displayInfo() {
                super.displayInfo();
                System.out.println("Weight: " + weight + " lbs");
        }
}

class DigitalProduct extends Product {
        String downloadLink;

        public DigitalProduct(String name, double price, String description, String downloadLink) {
                super(name, price, description);
                this.downloadLink = downloadLink;
        }

        public void displayInfo() {
                super.displayInfo();
                System.out.println("Download Link: " + downloadLink);
        }
}

public class Practice_2 {
        public static void main(String[] args) {
                Product physicalProduct = new PhysicalProduct("Mobile", 20000, "Samsung M Series", 2.5);
                Product digitalProduct = new DigitalProduct("Ebook", 9.99, "Theory of computation",
                                "https://example.com/ebook");

                System.out.println("Physical Product Information:");
                physicalProduct.displayInfo();

                System.out.println("\nDigital Product Information:");
                digitalProduct.displayInfo();
        }
}
