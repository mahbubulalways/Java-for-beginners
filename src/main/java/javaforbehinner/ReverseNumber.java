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
public class ReverseNumber {

    public static void main(String[] args) {
        int num, temp, reminder, reverse = 0;
        System.out.println("Enter the Number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            reminder = temp % 10;
            reverse = reverse * 10 + reminder;
            temp = temp / 10;

        }
        System.out.println("The Reverse Number is " + reverse);
        input.close();
    }
}
