package javaforbehinner;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        int num, temp, reminder;
        int sum = 0;
        System.out.println("Enter the digits");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            reminder = temp % 10;
            sum = sum + reminder;
            temp = temp / 10;
            System.out.println(temp);

        }
         System.out.println("The Sum of digits = " + sum);
    }
}