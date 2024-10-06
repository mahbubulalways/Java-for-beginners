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
public class DigitSpellingStatement {
    public static void main(String[] args) {
        int a ;
        System.out.println("Enter the digit");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        switch (a) {
            case 1:
                  System.out.println("Value is one");
                break;
            case 2:
                  System.out.println("Value is TWO");
                break;
            case 3:
                  System.out.println("Value is THREE");
                break;
            case 4:
                  System.out.println("Value is FOUR");
                break;
            case 5:
                  System.out.println("Value is FIVE");
                break;
            default:
                throw new AssertionError();
        }
    }
}
