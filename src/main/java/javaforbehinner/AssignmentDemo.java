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
public class AssignmentDemo {
    public static void main(String[] args) {
        int num;
       System.out.println("Enter a integer value");        
       Scanner getNum = new Scanner(System.in);
       num = getNum.nextInt();
       num += 10;
       System.out.println("The ans is = "+ num);
       num -= 10;
       System.out.println("The ans is = "+ num);
       num *= 10;
       System.out.println("The ans is = "+ num);
       num /= 10;
       System.out.println("The ans is = "+ num);
       num %= 10;
       System.out.println("The ans is = "+ num);
    }
}
