package recursion_in_java;

import java.util.Scanner;

public class Recursion {
  //  * Those method or function who call itself up to a specific base case called recursion.
    public static  int  fact(int n){
          if(n == 1 || n == 0){  // * Base Case
            return 1;
          } else{
            return n * fact(n - 1);  // * Recursive Call
          }
    }
    
     public static void main(String[] args) {
        int num ;
        System.out.print("Enter a number: ");
        Scanner input = new  Scanner(System.in);
        num = input.nextInt();

        int result = Recursion.fact(num);
        System.out.println("Factorial is: " + result);  

     }
}
