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
public class FindFactorial {
    public static void main(String[] args) {
        int a;
        int factorial = 1;
        System.out.println("Enter the number you want to find factorial");
        Scanner input = new Scanner(System.in);
        a= input.nextInt();
        
        for(int i = a; i > 0; i--){
        factorial *= i;
        }
        System.out.println("The Factorial is => " + factorial);
    } 
}
