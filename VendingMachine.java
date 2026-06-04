 import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tray;
        int product;
        String stay;
        int totalBill = 0;

        do {

            System.out.println("\n===== VENDING MACHINE =====");
            System.out.println("1. Snacks");
            System.out.println("2. Beverages");
            System.out.println("3. Chocolates");
            System.out.println("0. Exit");

            System.out.print("Select Tray: ");
            tray = sc.nextInt();

            switch (tray) {

                // SNACKS
                case 1:

                    do {

                        System.out.println("\n--- Snacks Menu ---");
                        System.out.println("1. Lays - Rs.20");
                        System.out.println("2. Uncle Chips - Rs.25");
                        System.out.println("3. Doritos - Rs.50");

                        System.out.print("Select Product: ");
                        product = sc.nextInt();

                        switch (product) {

                            case 1:
                                System.out.println("You selected Lays");
                                totalBill = totalBill + 20;
                                break;

                            case 2:
                                System.out.println("You selected Uncle Chips");
                                totalBill = totalBill + 25;
                                break;

                            case 3:
                                System.out.println("You selected Doritos");
                                totalBill = totalBill + 50;
                                break;

                            default:
                                System.out.println("Invalid Product");
                        }

                        System.out.print("Stay on same tray? (yes/no): ");
                        stay = sc.next();

                    } while (stay.equalsIgnoreCase("yes"));

                    break;

                // BEVERAGES
                case 2:

                    do {

                        System.out.println("\n--- Beverages Menu ---");
                        System.out.println("1. Coke - Rs.40");
                        System.out.println("2. Pepsi - Rs.35");
                        System.out.println("3. Juice - Rs.50");

                        System.out.print("Select Product: ");
                        product = sc.nextInt();

                        switch (product) {

                            case 1:
                                System.out.println("You selected Coke");
                                totalBill = totalBill + 40;
                                break;

                            case 2:
                                System.out.println("You selected Pepsi");
                                totalBill = totalBill + 35;
                                break;

                            case 3:
                                System.out.println("You selected Juice");
                                totalBill = totalBill + 50;
                                break;

                            default:
                                System.out.println("Invalid Product");
                        }

                        System.out.print("Stay on same tray? (yes/no): ");
                        stay = sc.next();

                    } while (stay.equalsIgnoreCase("yes"));

                    break;

                // CHOCOLATES
                case 3:

                    do {

                        System.out.println("\n--- Chocolates Menu ---");
                        System.out.println("1. Dairy Milk - Rs.30");
                        System.out.println("2. KitKat - Rs.20");
                        System.out.println("3. Snickers - Rs.45");

                        System.out.print("Select Product: ");
                        product = sc.nextInt();

                        switch (product) {

                            case 1:
                                System.out.println("You selected Dairy Milk");
                                totalBill = totalBill + 30;
                                break;

                            case 2:
                                System.out.println("You selected KitKat");
                                totalBill = totalBill + 20;
                                break;

                            case 3:
                                System.out.println("You selected Snickers");
                                totalBill = totalBill + 45;
                                break;

                            default:
                                System.out.println("Invalid Product");
                        }

                        System.out.print("Stay on same tray? (yes/no): ");
                        stay = sc.next();

                    } while (stay.equalsIgnoreCase("yes"));

                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Tray Selection");
            }

        } while (tray != 0);

        System.out.println("\nTotal Bill = Rs. " + totalBill);

        sc.close();
    }
}