class student1 {
    int rollNo;

    String name;

    student1(int rollNo, String name) {
        this.rollNo = rollNo;

        this.name = name;

    }

    void display() {

        System.out.println(name + "\t" + rollNo);
    }

    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("Name" + "\tRoll No.");
        System.out.println("-----------------------");
        student1 obj = new student1(2, "John");
        obj.display();

    }
}