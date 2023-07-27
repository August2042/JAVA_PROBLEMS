import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        System.out.println("Enter the size of array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the array element");
            a[i] = sc.nextInt();
        }
        System.out.println("The arrays element are :");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter the searching element :");
        int key = sc.nextInt();

        for(int i=0;i<size;i++)
        {
            if(a[i]==key)
            {
                System.out.println("the key is found "+a[i]);
                
            }
            
            else
            {
                System.out.println("not found");
            }
        }

    }

}
