
import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        int speed;
    char violation;
    int fine=0;

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Vehicle Speed");
    speed=sc.nextInt();
    System.out.println("Does this vehicle has previous Violations : ? (y/n)");
    violation=sc.next().charAt(0);

            if(speed>100){
                fine=1000;
            }
            else if(speed>80){
                fine = 500;
            }
            else{
                fine=0;
            }
    
            if(violation=='y'|| violation=='Y'){
                fine=fine*2;
            }
            
            System.out.println("Fine for repeated violation is : "+fine);
    
            sc.close();
    
    
    
    
    
    
        }

}

























// import java.util.Scanner;

// public class TrafficFine {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int speed;
//         char repeatedViolation;
//         int fine = 0;

//         System.out.println("Enter vehicle speed:");
//         speed = sc.nextInt();

//         System.out.println("Is it a repeated violation? (y/n)");
//         repeatedViolation = sc.next().charAt(0);

//         // Calculate fine
//         if (speed > 100) {
//             fine = 1000;
//         }
//         else if (speed > 80) {
//             fine = 500;
//         }
//         else {
//             fine = 0;
//         }

//         // Double fine for repeated violation
//         if (repeatedViolation == 'y' || repeatedViolation == 'Y') {
//             fine = fine * 2;
//         }

//         System.out.println("Traffic Fine = Rs. " + fine);

//         sc.close();
//     }
// }