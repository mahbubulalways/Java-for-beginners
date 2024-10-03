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
public class TempaeatureDemo {
    public static void main(String[] args) {
        double celsius, result;
        System.out.print("Enter the celsius value  ");
        Scanner getCelsius = new Scanner(System.in);
        celsius = getCelsius.nextDouble();
        // celsius to fahrenheit
        result = (double) 9/5 * celsius + (double) 32;
        System.out.println("The Celsius to fahrenheit = " + result);
        
    }
}
