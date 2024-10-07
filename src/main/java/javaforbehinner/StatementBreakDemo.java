/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaforbehinner;

/**
 *
 * @author HP
 */
public class StatementBreakDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 10) {
                System.out.println(i);
                break;
            }
            if (i == 15) {
                System.out.println("Hey  i am"+i);
               continue ;
            }
            System.out.println(i);
        }
    }
}
