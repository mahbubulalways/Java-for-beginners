package javaforbehinner;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int num;
        int count = 0;
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num == 0 || num == 1) {
            System.out.println("This is not a prime number");
        } else {
            for (int i = 2; i < num/2; i++) {
                if (num % i == 0) {
                    count ++;
                    break;
                }
            }
            // System.out.println(count);
            if (count == 0) {
                System.out.println("This is Prime Number");
            } else {
                System.out.println("This is not Prime Number");
    
            }
        }

        
        
    }
}
