import java.util.Scanner;

public class metro {
    public static void main(String[] args) {
        char ch;
        int selected_station;
        int number_of_tokens;
        int total_price;
        char character = 'y';

        int num;
        int total_bill;
        int quant;

        while (character == 'y') {

            System.out.println("-----------------------------------------------------------");
            System.out.println("\t\tWelcome to DMRC\t\t");
            System.out.println("-----------------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first character of your destination station : ");
            ch = sc.next().charAt(0);

            switch (ch) {
                case 'a':
                    System.out.println("1.\tARJAN GARH");
                    System.out.println("2.\tAKSHARDHAM");
                    System.out.println("3.\tAIIMS");
                    System.out.println("4.\tADARSH NAGAR");
                    System.out.println("5.\tANANAND VIHAR");
                    System.out.println("6.\tAZADPUR");
                    System.out.println("Enter the selected station :");
                    selected_station = sc.nextInt();
                    switch (selected_station) {
                        case 1:
                            System.out.println("The selected station is ARJAN GARH");
                            System.out.println("The price for this destination : ₹50");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 50 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 2:
                            System.out.println("The selected station is AKSHARDHAM");
                            System.out.println("The price for this destination : ₹50");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 50 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 3:
                            System.out.println("The selected station is AIIMS");
                            System.out.println("The price for this destination : ₹60");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 60 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 4:
                            System.out.println("The selected station is ADARSH NAGAR");
                            System.out.println("The price for this destination : ₹40");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 40 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 5:
                            System.out.println("The selected station is ANANAND VIHAR");
                            System.out.println("The price for this destination : ₹30");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 30 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 6:
                            System.out.println("The selected station is AZADPUR");
                            System.out.println("The price for this destination : ₹20");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 20 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;

                        default:
                            System.out.println("Enter the correct station");
                            break;
                    }
                    break;
                case 'b':
                    System.out.println("1.\tBADARPUR BORDER");
                    System.out.println("2.\tBATA CHOWK");
                    System.out.println("3.\tBOTANICAL GARDEN");
                    System.out.println("4.\tBARAKHAMBA");
                    System.out.println("5.\tBELVEDERE TOWER");
                    System.out.println("6.\tBADKAL MOD");
                    System.out.println("Enter the selected station :");
                    selected_station = sc.nextInt();
                    switch (selected_station) {
                        case 1:
                            System.out.println("The selected station is BADARPUR BORDER");
                            System.out.println("The price for this destination : ₹50");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 50 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 2:
                            System.out.println("The selected station is BATA CHOWK");
                            System.out.println("The price for this destination : ₹50");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 50 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 3:
                            System.out.println("The selected station is BOTANICAL GARDEN");
                            System.out.println("The price for this destination : ₹60");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 60 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 4:
                            System.out.println("The selected station is BARAKHAMBA");
                            System.out.println("The price for this destination : ₹40");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 40 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 5:
                            System.out.println("The selected station is BELVEDERE TOWER");
                            System.out.println("The price for this destination : ₹30");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 30 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 6:
                            System.out.println("The selected station is BADKAL MOD");
                            System.out.println("The price for this destination : ₹20");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 20 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;

                        default:
                            System.out.println("Enter the correct station");
                            break;
                    }
                    break;
                case 'c':
                    System.out.println("1.\tCHATTARPUR ");
                    System.out.println("2.\tCHAWRI BAZAR");
                    System.out.println("3.\tCHANDNI CHOWK");
                    System.out.println("4.\tCENTRAL SECRETERIAT");
                    System.out.println("5.\tCHIRAG DELHI");
                    System.out.println("6.\tCIVIL LINE");
                    System.out.println("Enter the selected station :");
                    selected_station = sc.nextInt();
                    switch (selected_station) {
                        case 1:
                            System.out.println("The selected station is CHATTARPUR ");
                            System.out.println("The price for this destination : ₹50");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 50 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 2:
                            System.out.println("The selected station is CHAWRI BAZAR");
                            System.out.println("The price for this destination : ₹50");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 50 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 3:
                            System.out.println("The selected station is CHANDNI CHOWK");
                            System.out.println("The price for this destination : ₹60");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 60 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 4:
                            System.out.println("The selected station is CENTRAL SECRETERIAT");
                            System.out.println("The price for this destination : ₹40");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 40 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 5:
                            System.out.println("The selected station is CHIRAG DELHI");
                            System.out.println("The price for this destination : ₹30");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 30 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 6:
                            System.out.println("The selected station is CIVIL LINE");
                            System.out.println("The price for this destination : ₹20");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 20 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;

                        default:
                            System.out.println("Enter the correct station");
                            break;
                    }
                    break;
                case 'd':
                    System.out.println("1.\tDHAULA KUAN");
                    System.out.println("2.\tDELHI CANTT");
                    System.out.println("3.\tDELHI GATE");
                    System.out.println("4.\tDWARKA");
                    System.out.println("5.\tDILI HATT");
                    System.out.println("6.\tDILSHAD GARDEN");
                    System.out.println("Enter the selected station :");
                    selected_station = sc.nextInt();
                    switch (selected_station) {
                        case 1:
                            System.out.println("The selected station is DHAULA KUAN");
                            System.out.println("The price for this destination : ₹50");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 50 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 2:
                            System.out.println("The selected station is DELHI CANTT");
                            System.out.println("The price for this destination : ₹50");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 50 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 3:
                            System.out.println("The selected station is DELHI GATE");
                            System.out.println("The price for this destination : ₹60");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 60 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 4:
                            System.out.println("The selected station is DWARKA");
                            System.out.println("The price for this destination : ₹40");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 40 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 5:
                            System.out.println("The selected station is DILI HATT");
                            System.out.println("The price for this destination : ₹30");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 30 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 6:
                            System.out.println("The selected station is DILSHAD GARDEN");
                            System.out.println("The price for this destination : ₹20");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 20 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;

                        default:
                            System.out.println("Enter the correct station");
                            break;
                    }
                    break;
                case 'm':
                    System.out.println("1.\tMOOLCHAND");
                    System.out.println("2.\tMALVIYA NAGAR");
                    System.out.println("3.\tM.G.ROAD");
                    System.out.println("4.\tMANDI HOUSE");
                    System.out.println("5.\tMOHAN ESTATE");
                    System.out.println("6.\tMOTI NAGR");
                    System.out.println("Enter the selected station :");
                    selected_station = sc.nextInt();
                    switch (selected_station) {
                        case 1:
                            System.out.println("The selected station is MOOLCHAND");
                            System.out.println("The price for this destination : ₹50");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 50 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 2:
                            System.out.println("The selected station is MALVIYA NAGAR");
                            System.out.println("The price for this destination : ₹50");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 50 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 3:
                            System.out.println("The selected station is M.G.ROAD");
                            System.out.println("The price for this destination : ₹60");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 60 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 4:
                            System.out.println("The selected station is MANDI HOUSE");
                            System.out.println("The price for this destination : ₹40");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 40 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 5:
                            System.out.println("The selected station is MOHAN ESTATE");
                            System.out.println("The price for this destination : ₹30");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 30 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;
                        case 6:
                            System.out.println("The selected station is MOTI NAGR");
                            System.out.println("The price for this destination : ₹20");
                            System.out.println("Enter the no. of tokens required by you :");
                            number_of_tokens = sc.nextInt();
                            total_price = 20 * number_of_tokens;
                            System.out.println("The total price =" + total_price);

                            break;

                        default:
                            System.out.println("Enter the correct station");
                            break;
                    }
                    break;

                default:
                    System.out.println("Enter the correct character....");
                    break;
            }
            // System.out.println("Do you want to order food if yes then y or no...");
            System.out.println("-----------------------------------------------------------");
            System.out.println("\t\tWELCOME TO DMRC FOOD CORNER\t\t");
            System.out.println("------------------------------------------------------------");
            System.out.println("Enter the no. :");
            Scanner obj = new Scanner(System.in);
            num = obj.nextInt();

            switch (num) {
                case 1:

                    System.out.println("Dosa");
                    System.out.println("The total price is Rs. 50");
                    System.out.println("Enter the quantity of Dosa :");
                    quant = obj.nextInt();
                    total_bill = 50 * quant;
                    System.out.println("The total bill =" + total_bill);

                    break;
                case 2:
                    System.out.println("Burger");
                    System.out.println("The total price is Rs. 80");
                    System.out.println("Enter the quantity of burger :");
                    quant = obj.nextInt();
                    total_bill = 80 * quant;
                    System.out.println("The total bill =" + total_bill);
                    break;
                case 3:
                    System.out.println("Shake");
                    System.out.println("The total price is Rs. 40");
                    System.out.println("Enter the quantity of Shake :");
                    quant = obj.nextInt();
                    total_bill = 40 * quant;
                    System.out.println("The total bill =" + total_bill);
                    break;
                case 4:
                    System.out.println("Noodles");
                    System.out.println("The total price is Rs. 60");
                    System.out.println("Enter the quantity of Noodles :");
                    quant = obj.nextInt();
                    total_bill = 60 * quant;
                    System.out.println("The total bill =" + total_bill);
                    break;
                default:
                    System.out.println(" Enter the correct choice");
                    break;
            }
            System.out.println("Do you want to continue this DMRC APP then press y and else n");
            character = sc.next().charAt(0);
            System.out.println("*********************************THANKYOU FOR VISITING DMRC APP**********************************");

        }

    }
}
