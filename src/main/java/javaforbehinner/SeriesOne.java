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
public class SeriesOne {
    public static void main(String[] args) {
        int n, num;
        System.out.println("Enter the number");
        Scanner input= new Scanner(System.in);
        n = input.nextInt();
        for (int i = 1; i <= n; i=i+2) {
            System.out.println("Seris = " + i);
        }
    }
}
