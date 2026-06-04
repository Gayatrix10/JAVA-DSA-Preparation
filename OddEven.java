
// import java.util.Scanner;
// import javax.lang.model.util.ElementScanner14;

// public class OddEven {
//     public static void main(String[] args) {
//         int num;
//         int even=0;
//         int odd=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter count of numbers needed - ");
//         num=sc.nextInt();


//         for(int i=1;;i++){
//             if(num==0)
//             {
//                 break;
//             }
//             else if(num%2==0)
//             {
//                 even++;
//             }
//             else{
//                 odd++;
//             }

//         }

//         System.out.println("Even numbers : "+even);
//         System.out.println("Odd numbers : "+odd);
//         sc.close();
//     }
// }


import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int even = 0;
        int odd = 0;

        System.out.println("Enter numbers:");

        do {

            num = sc.nextInt();

            if(num != 0)
            {
                if(num % 2 == 0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }

        } while(num != 0);

        System.out.println("Even numbers : " + even);
        System.out.println("Odd numbers : " + odd);

        sc.close();
    }
}