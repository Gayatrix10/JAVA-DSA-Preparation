import java.util.Scanner;
public class Electricity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units;
        double bill = 0;

        System.out.println("Enter the no. of units");
        units = sc.nextInt();

        if (units <= 100) {

            bill = (1.5 * units) + 50.0;

        }
        else if (units <= 200) {

            bill = (2.5 * units) + 50.0;

        }
        else {

            bill = (5.0 * units) + 50.0;

        }

        if (bill > 2000) {

            bill = bill + (bill * 0.10);

        }
        System.out.println("Electricity Bill for " + units + " unit is " + bill + " Rs.");
        sc.close();
    }
}