public class fin {
    final int a = 100;

    void display() {
        a = 200;
        System.out.println(a);
    }

    public static void main(String[] args) {
        fin obj = new fin();
        obj.display();
    }

}
