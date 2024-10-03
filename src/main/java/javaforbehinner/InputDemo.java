/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package javaforbehinner;
import java.util.Scanner;
public class InputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
          Scanner getName = new Scanner(System.in);
        String name;
        System.out.println("Enter a integer value");
         number= input.nextInt();
         System.out.println("Enter your name");
         name = getName.nextLine();
         System.out.println("The Integer value is " + number);
         System.out.println("The name is " + name);
    }
}
