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
public class SumEvenOdd {

    public static void main(String[] args) {
        int start, end;
        int sum =0;
        System.out.println("Enter Starting number");
        Scanner starting = new Scanner(System.in);
        start = starting.nextInt();
          System.out.println("Enter Ending number");
        Scanner ending = new Scanner(System.in);
        end = ending.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        
        System.out.println(sum);

    }
}
