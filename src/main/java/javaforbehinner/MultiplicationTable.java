

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
public class MultiplicationTable {
    public static void main(String[] args) {
        int num,namata ;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        num =input.nextInt();
        for(int i=1 ; i<=10; i++){
             namata = num*i ;
             System.out.println(num + " * " + i + " = " + namata);
          
    }
    }
}
