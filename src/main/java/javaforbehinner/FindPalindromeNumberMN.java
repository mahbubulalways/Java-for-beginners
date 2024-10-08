/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaforbehinner;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FindPalindromeNumberMN {

    public static void main(String[] args) {
        int start, end, temp, reminder;
        int reverse = 0;
        int count = 0;
        System.out.println("Enter the starting number");
        Scanner startingNum = new Scanner(System.in);
        start = startingNum.nextInt();
        System.out.println("Enter the ending number");
        Scanner endingNum = new Scanner(System.in);
        end = endingNum.nextInt();
        System.out.print("The Palindrom number from " + start + " to " + end + "  are " );
        
        for (int i = start; i <= end; i++) {
            temp = i;
            while (temp != 0) {
                reminder = temp % 10;
                reverse = reverse * 10 + reminder;
                temp = temp / 10;
            }
            if (i == reverse && i > 10) {

                System.out.print(reverse + ", ");
                count++;
            } else {
                reverse = 0;
            }
        }
        System.out.println("");
        System.out.println("Total Palindrome number from " + start + " to " + end + " are " + count);

    }
}
