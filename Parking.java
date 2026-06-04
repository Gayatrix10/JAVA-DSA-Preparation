import java.util.*; //package which has scanner class
public class Parking {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // to take user input
        int bill;     
        System.out.println("Enter number of hours");
            int hours = sc.nextInt();

            if(hours<=2){
                bill= hours*100;
                System.out.println("Bill Amount : "+bill+"Rs.");
            }
            else if(hours<=5){
                bill=hours*50;
                System.out.println("Bill Amount : "+bill+"Rs.");
            }
           else
           {
            bill=(2*100)+(3*50)+((hours-5)*10);
            System.out.println("Bill Amount : "+bill+" Rs.");
           }

    }
}
