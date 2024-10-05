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
public class StatementDemo {

    public static void main(String[] args) {
        int a;
        System.out.println("Enter the value");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
//        if ( a % (int) 2 == 0 ) {
//            System.out.println("This is even number");
//        } else {
//            System.out.println("This is odd number");
//        }

//        if (a == 1) {
//            System.out.println("ONE");
//        } else if (a == 2) {
//            System.out.println("TWO");
//        } else if (a == 3) {
//            System.out.println("THREE");
//        } else {
//            System.out.println("Its Invalid");
//        }

        switch (a) {
            case 1 :
                System.out.println(a);
                break;
            default:
                throw new AssertionError();
        }



    }

}
