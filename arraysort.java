import java.util.Arrays;
import java.util.Scanner;

public class arraysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size;
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int a[] = new int[size];

        for(int i =0;i<size-1;i++)
        {
            System.out.println("Enter the array element:");
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("sorted Array ::"+Arrays.toString(a));
    }
}
