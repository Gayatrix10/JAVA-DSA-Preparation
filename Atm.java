
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int balance,amount,min,withdraw;
        min=1000;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Withdraw Amount : ");
        withdraw=sc.nextInt();
        System.out.println("Enter Balance Amount : ");
        balance=sc.nextInt();

        if(balance>=withdraw){
            System.out.println("Withdrawl Successfull !!");
            }

        else{
            System.out.println("Withdrawl Failed ! Minimum Balance Violation !");
        }

    }
}
