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
public class ValidateUserLoop {

    public static void main(String[] args) {
        String userName;
        String password;
        System.out.println("Enter user Name");
        Scanner name = new Scanner(System.in);
        userName = name.nextLine();

        System.out.println("Enter password");
        Scanner passwordNum = new Scanner(System.in);
        password = passwordNum.nextLine();

        while (userName !=  (String)"sabbir" && password !=  (String) "1234") {
            System.out.println("Invalid user name and password. Please try again.");
            System.out.println("Enter user Name");
            userName = name.nextLine();
            System.out.println("Enter password");
            password = passwordNum.nextLine();

        }
        
    }
}
