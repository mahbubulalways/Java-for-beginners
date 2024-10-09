package javaforbehinner;

import java.util.Scanner;

public class PatternDemoTwo {
public static void main(String[] args) {
    int n ;
    System.out.println("Enter the Line Numbers");
    Scanner input = new Scanner(System.in);
    n= input.nextInt();
    System.out.println("Ans is:");
    for(int row = 1 ; row <= n ; row++){
        for(int col = 1; col <= row; col++){
            // 1 % 1 =1
            // 2 % 2 =  1 0
            // 3 % 2 = 1 0 1
            // 4 % 2 = 1 0 1 0
            // 5 % 2 = 1 0 1 0 1
            System.out.println(col % 2); 
        }
        System.out.println();
    }

}
}
