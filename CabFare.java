
import java.util.Scanner;

public class CabFare {
    public static void main(String[] args) {
        int distance;
        int price;
        char night;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Distance : ");
        distance=sc.nextInt();
        System.out.println("Travelling at night ?");
        night=sc.next().charAt(0);
        if(distance<=5){
            if(night=='y'||night=='Y'){
                price= 50+(50*20)/100;
            }

        }
    }
}
