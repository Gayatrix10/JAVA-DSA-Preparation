import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        int sub;
        int m1,m2,m3;
        double w1,w2,w3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks : ");
        m1=sc.nextInt();
        System.out.println("Enter Weights : ");
        w1=sc.nextDouble();

        System.out.println("Enter Marks : ");
         m2=sc.nextInt();
        System.out.println("Enter Weights : ");
        w2=sc.nextDouble();
        
         System.out.println("Enter Marks : ");
        m3=sc.nextInt();
        System.out.println("Enter Weights : ");
        w3=sc.nextDouble();
                
                 
        double total = (m1*w1 + m2*w2 + m3*w3)/100;
        System.out.println("Total Marks : "+total);
        if(total>=90)
        {
            System.out.println("A grade");
        }
        else if(total>=80)
        {
            System.out.println("B grade");
        }
        else if(total>=70)
        {
            System.out.println("C grade");
        }
        else if(total>=60)
        {
            System.out.println("D grade");
        }
        else 
        {
            System.out.println("FAIL");
        }
    }
}
