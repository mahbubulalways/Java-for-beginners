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
public class TriangleDemo {

    public static void main(String[] args) {
        double base, height, result;
        System.out.println("Enter the base of triangle");
        Scanner getBase = new Scanner(System.in);
        base = getBase.nextDouble();
        System.out.println("Enter the height of triangle");
        Scanner getHeight = new Scanner(System.in);
        height = getHeight.nextDouble();
        result = 0.5 * base * height;
        
        
        
        
        System.out.println("Result = " + result);
    }
}
