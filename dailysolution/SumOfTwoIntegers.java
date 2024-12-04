package dailysolution;
import java.util.Scanner;
// 1 - Sum of two integers

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        scanner.close();
    }
    
}

// >>>>>>>// second apporach/


// public class SumOfTwoIntegers {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 3;
//         int sum = a + b;
//         System.out.println("The sum is: " + sum);
//     }
// }
