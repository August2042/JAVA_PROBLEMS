interface A {
    void display();
}

interface B {
    void display();
}

public class multiple implements A, B {

    public void display() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        multiple obj = new multiple();
        obj.display();
    }

}
