// import java.util.*;

// public class scenario {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int players;
//         int balls;
//         int distributed;

//         System.out.println("Enter the number of players :");
//         players = sc.nextInt();
//         System.out.println("Enter the number of ball :");
//         balls = sc.nextInt();

//         distributed = balls / players;
//         int remaining_ball=balls%players;
//         System.out.println("The distribution :" + distributed);
//         System.out.println("The remaining :"+remaining_ball);

//     }
// }

/*Next program */
import java.util.*;

public class scenario {
    public static void main(String[] args) {

        String choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t MENU \t\t");

        System.out.println("1]. Breakfast  -> C] Chai , T] Toast");
        System.out.println("2]. Lunch");
        System.out.println("3]. Dinner");
        System.out.println("Enter the choice you want :");
        choice = sc.next();

        switch (choice) {
            case "1", "Chai", "Toast":
                System.out.println("Breakfast item :");
                System.out.println("Chai and Tost");

                break;
            case "2", "Chapatti", "Shahi Paneer":
                System.out.println("Lunch item :");
                System.out.println("Chapatti and Shahi Paneer");

                break;

            default:
                break;
        }

    }
}
