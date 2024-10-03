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
public class ArithmeticDemo {
    public static void main(String[] args) {
        int num1 ,num2, sum;
        System.out.println("Enter 1st number");
        Scanner getNum1 = new Scanner(System.in);
        num1= getNum1.nextInt();
        System.out.println("Enter 2nd number");
        Scanner getNum2 = new Scanner(System.in);
        num2= getNum2.nextInt();
        
        sum = num1+num2;
        System.out.println("The sum is = "+ sum);
        sum = num1 - num2;
        System.out.println("The sum is = "+ sum);
        sum = num1 * num2;
        System.out.println("The sum is = "+ sum);
        sum = num1 / num2;
        System.out.println("The sum is = "+ sum);
        sum = num1 % num2;
        System.out.println("The sum is = "+ sum);
    }
}
