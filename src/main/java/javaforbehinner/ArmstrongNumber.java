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
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num, temp, reminder, cube;
        int sum=0;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        temp = num;
        while(temp != 0){
           reminder = temp%10;
           cube = reminder* reminder* reminder;
           sum = sum + cube;
           temp = temp/10;
        }
        if(num == sum){
            System.out.println("This is Armstrong number " + sum);
        }else{
         System.out.println("This is not an Armstrong number");
        }
    }
}
