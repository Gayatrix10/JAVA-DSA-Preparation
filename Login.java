
import java.util.Scanner;

public class Login{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password="admin";
        String input;
        int attempts=0;

        while(attempts<3){
            System.out.println("Enter Password : ");
            input=sc.nextLine();

            if(input.equals(password)){
                System.out.println("Login Successfull !!");
                 System.out.println("------------------------");    
                break;       
             }
             else{
                attempts++;
                if(attempts==3)
                {
                    System.out.println("Account Locked !");
                }
                else{
                    System.out.println("Wrong Password !");
                    System.out.println("------------------------");
                }
             }
        }
        sc.close();
    }
}
