
import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        int amount;
        int discount;
        char premium;
        int finalamt;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount - ");
        amount=sc.nextInt();

        System.out.println("Are you a Premium Member ? ");
        premium=sc.next().charAt(0);

        if(amount>=5000){
            if(premium =='y'|| premium =='Y'){
            discount=25;    //5+20 extra discount for premium member;
            finalamt=amount-(amount*discount/100);
        }
            else{
                discount=20;
            finalamt =amount-(amount*discount/100);
            }
            System.out.println("Final Amount = "+finalamt+" Rs.");
        }


        else if (amount>=3000) {

            if(premium =='y'|| premium =='Y'){
            discount=15;    //5+10; extra discount for premium member
            finalamt=amount-(amount*discount/100);
        }
            else{
                discount=10;
            finalamt=amount-(amount*discount/100);
        }
                    System.out.println("Final Amount = "+finalamt+" Rs.");

        }
        
        else{
            discount=0;
            System.out.println("No discount !!");

        }
    }
}
