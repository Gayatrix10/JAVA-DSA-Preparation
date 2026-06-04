import java.util.Scanner;
public class Warehouse {
    public static void main(String[] args) {
        int n;
        int min=0;
        int current=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of products : ");
        n=sc.nextInt();

        int c=0; 
        for(int i=1;i<=n;i++)
        {
            System.out.println("Product No. : "+i);

            System.out.println("Enter Current Stock : ");
            current=sc.nextInt();

           System.out.println("Enter Minimum required stock : ");
            min=sc.nextInt();

            if(current<min){
                System.out.println("Restock Needed for product "+i);
                int required = min-current;
                System.out.println("Required Stock : "+required);
                c++;
            }

        }

        System.out.println("Total No. Products needed to be restocked : "+c);
         sc.close();
    }
   
}
