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
public class PatternDemoOne {

    public static void main(String[] args) {
        int n;
        System.out.println("Please Enter Line Numbers");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        // for (int row = 1; row <= n; row++) {
        //    for (int col = 1; col <= row; col++) {
        //        System.out.println(" " + col);
        //    }
        //     System.out.println("");
        // }
// * REVERSE WAY
        for (int row = n; row > 0; row--) {
           for (int col = 1; col <= row; col++) {
               System.out.println(" " + col);
           }
            System.out.println("");
        }
    }
}
